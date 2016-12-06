package klassen.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import klassen.Fahrzeug;
import klassen.FahrzeugListe;
import klassen.LKW;
import klassen.Motorrad;
import klassen.PKW;

public class FMFrame extends JFrame {

	private JLabel lblHeader;
	private JTable table;
	private JScrollPane scrollTable;
	private JProgressBar progBar;
	private JButton btnInfo;
	private JButton btnAdd;
	private JButton btnLoad;
	private JLabel lblHersteller, lblLeistung, lblPreis, lblTyp;
	private JTextField fldHersteller;
	private JSpinner spinLeistung, spinPreis;
	private JComboBox boxTyp;
	private JPanel pnlAdd;
	private JPanel pnlLeft;

	FahrzeugListe<Fahrzeug> model;

	public FMFrame(FahrzeugListe<Fahrzeug> model) {
		this.model = model;

		setTitle("Fahrzeug Manager");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		createWidgets();
		addWidgets();
		setUpInteractions();

		pack();
		setLocationRelativeTo(null);

		WindowListener winListener = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int answer = JOptionPane.showConfirmDialog(FMFrame.this,
						"Wollen sie das Programm wirklich beenden ?",
						"Wirklich beenden ?", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);
				if (answer == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		};

		addWindowListener(winListener);
	}

	private void createWidgets() {
		lblHeader = new JLabel("Fahrzeug Manager");
		lblHeader.setFont(lblHeader.getFont().deriveFont(
				Font.BOLD + Font.ITALIC, 30));
		lblHeader.setForeground(Color.WHITE);
		lblHeader.setOpaque(true);
		lblHeader.setBackground(Color.BLACK);
		lblHeader.setHorizontalAlignment(SwingConstants.CENTER);
		// lblHeader.setBounds(0, 0, 500, 40);

		progBar = new JProgressBar(0, 100);
		progBar.setPreferredSize(new Dimension(0, 30));
		// progBar.setBounds(0, 445, 485, 20);

		table = new JTable(model);
		table.setAutoCreateRowSorter(true);

		scrollTable = new JScrollPane(table);
		// scrollTable.setBounds(170, 50, 310, 390);

		btnInfo = new JButton("Information...");
		btnInfo.setAlignmentX(LEFT_ALIGNMENT);
		// btnInfo.setBounds(5, 415, 100, 25);

		btnLoad = new JButton("Lade Bestand ");
		btnLoad.setAlignmentX(LEFT_ALIGNMENT);

		pnlAdd = new JPanel();
		pnlAdd.setLayout(new GridLayout(0, 2, 5, 5));
		// pnlAdd.setBounds(0, 50, 200, 300);

		lblHersteller = new JLabel("Hersteller");
		lblLeistung = new JLabel("Leistung");
		lblPreis = new JLabel("Preis");
		lblTyp = new JLabel("Typ");

		// lblHersteller.setBounds(10, 0, 100, 25);
		// lblLeistung.setBounds(10, 30, 100, 25);
		// lblPreis.setBounds(10, 60, 100, 25);
		// lblTyp.setBounds(10, 90, 100, 25);

		fldHersteller = new JTextField();
		spinLeistung = new JSpinner(new SpinnerNumberModel(100, 5, 1200, 10));
		spinPreis = new JSpinner(new SpinnerNumberModel(5000, 500, 100000, 100));
		boxTyp = new JComboBox(new Object[] { "PKW", "LKW", "Motorrad" });

		//fldHersteller.setBounds(70, 0, 90, 25);
		// spinLeistung.setBounds(70, 30, 90, 25);
		// spinPreis.setBounds(70, 60, 90, 25);
		// boxTyp.setBounds(70, 90, 90, 25);

		btnAdd = new JButton("Hinzufügen");
		btnAdd.setEnabled(false);
		// btnAdd.setBounds(70, 120, 90, 25);

		pnlLeft = new JPanel();
		pnlLeft.setLayout(new BoxLayout(pnlLeft, BoxLayout.PAGE_AXIS));
	}

	private void addWidgets() {
		getContentPane().setLayout(new BorderLayout(5, 5));
		getContentPane().add(lblHeader, BorderLayout.PAGE_START);
		getContentPane().add(progBar, BorderLayout.PAGE_END);
		getContentPane().add(scrollTable, BorderLayout.CENTER);

		pnlAdd.add(lblHersteller);
		pnlAdd.add(fldHersteller);

		pnlAdd.add(lblLeistung);
		pnlAdd.add(spinLeistung);

		pnlAdd.add(lblPreis);
		pnlAdd.add(spinPreis);

		pnlAdd.add(lblTyp);
		pnlAdd.add(boxTyp);

		pnlAdd.add(Box.createHorizontalGlue());
		pnlAdd.add(btnAdd);

		pnlAdd.setMaximumSize(pnlAdd.getPreferredSize());
		pnlAdd.setAlignmentX(LEFT_ALIGNMENT);

		pnlLeft.add(pnlAdd);
		pnlLeft.add(Box.createVerticalGlue());
		pnlLeft.add(btnLoad);
		pnlLeft.add(btnInfo);

		pnlLeft.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

		getContentPane().add(pnlLeft, BorderLayout.LINE_START);
	}

	private void setUpInteractions() {
		btnAdd.addActionListener(new AddFahrzeugAction());
		btnLoad.addActionListener(new LadeBestandAction());
		btnInfo.addActionListener(new InfoAction());
		fldHersteller.addCaretListener(new HerstellerListener());
	}

	private class HerstellerListener implements CaretListener {
		@Override
		public void caretUpdate(CaretEvent e) {
			JTextField fld = (JTextField) e.getSource();
			String text = fld.getText();
			btnAdd.setEnabled(!text.trim().isEmpty());
		}

	}

	private class AddFahrzeugAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String hersteller = fldHersteller.getText();
			int leistung = (Integer) spinLeistung.getValue();
			int preis = (Integer) spinPreis.getValue();
			String typ = boxTyp.getSelectedItem().toString();
			Fahrzeug f = null;
			if (typ.equals("PKW")) {
				f = new PKW(leistung, hersteller, preis, 4);
			}
			if (typ.equals("LKW")) {
				f = new LKW(leistung, hersteller, preis);
			}
			if (typ.equals("Motorrad")) {
				f = new Motorrad(leistung, hersteller, preis);
			}
			// Model-View-Controller
			model.add(f);
		}
	}

	private class LadeBestandAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			progBar.setStringPainted(true);
			new Thread() {
				@Override
				public void run() {

					for (int i = 1; i <= 100; i++) {
						// Daten lesen...
						try {
							Thread.sleep((long) (Math.random() * 50));
						} catch (InterruptedException ex) {
							ex.printStackTrace();
						}
						final int iNow = i;
						SwingUtilities.invokeLater(new Runnable() {
							@Override
							public void run() {
								model.add(new PKW(iNow, "Test-Daten", iNow, 4));
								progBar.setString("Lade Bestand... " + iNow
										+ "%");
								progBar.setValue(iNow);
							}
						});
					}
					SwingUtilities.invokeLater(new Runnable() {
						@Override
						public void run() {
							progBar.setValue(0);
							progBar.setStringPainted(false);
						}
					});

				}
			}.start();
		}
	}

	private class InfoAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String msg = new String();
			msg += "Es befinden sich " + model.getElementCount()
					+ " Fahrzeuge im Bestand.";
			msg += "\n";
			msg += "Gesamt-Wert des Bestands: " + model.berechneEinnahmen()
					+ " €";
			InfoPopup popup = new InfoPopup(FMFrame.this, msg);
			popup.setLocationRelativeTo(FMFrame.this);
			popup.setVisible(true);
		}
	}
}
