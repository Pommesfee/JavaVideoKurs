package programme.gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import klassen.Fahrzeug;
import klassen.FahrzeugListe;
import klassen.gui.FMFrame;

public class GuiDemo {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
		
			@Override
			public void run() {
			
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}

				FahrzeugListe<Fahrzeug> model = new FahrzeugListe<Fahrzeug>(500);
		
				JFrame frame = new FMFrame(model);
				frame.setVisible(true);
			}
	
		});
	}
}

