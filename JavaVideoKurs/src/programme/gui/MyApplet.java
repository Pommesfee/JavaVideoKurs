package programme.gui;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JApplet;

public class MyApplet extends JApplet {

	@Override
	public void init() {
		System.out.println("init");
		pack();
	}
	
	private void pack() {
		Container c = getContentPane();
		Dimension preferedSize = c.getLayout().preferredLayoutSize(c);
		setSize(preferedSize.width, preferedSize.height);
	}
	
	public void start() {
		getParameter("");
		System.out.println("start");
	}
	
	public void stop() {
		System.out.println("stop");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
}
