package klassen.gui;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JTextPane;

public class InfoPopup extends JDialog {

	public InfoPopup(FMFrame owner, String msg) {
		super(owner, true);
		setTitle("Bestands-Informationen");
		setResizable(false);

		JTextPane txt = new JTextPane();
		txt.setText(msg);
		txt.setEditable(false);
		txt.setBackground(getContentPane().getBackground());
		txt.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		
		getContentPane().add(txt);
		pack();
	}
	
}
