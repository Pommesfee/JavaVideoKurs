package programme.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GfxDemo extends JPanel {

	private static BufferedImage img;
	
	static{
		try {
			img = ImageIO.read(GfxDemo.class.getClassLoader().getResourceAsStream("img/img.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g.setColor(new Color(255, 0, 0, 127));
		g.fillRect(5, 5, 100, 100);

		g.setColor(new Color(0, 0, 255, 127));
		g.fillOval(50, 50, 300, 300);
		
		g.drawImage(img, 30, 30, null);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame f = new JFrame();
				f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
				GfxDemo g  = new GfxDemo();
				g.setPreferredSize(new Dimension(500, 500));
				
				JButton b = new JButton();
				b.setIcon(new ImageIcon(img));
				
				f.add(g);
				//f.add(b);
				f.pack();
				f.setLocationRelativeTo(null);
				f.setVisible(true);
			}
		});
	}

}
