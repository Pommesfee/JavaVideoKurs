package programme;

import java.awt.Color;

import klassen.Auto;

public class DatentypenDemo {

	public static void main(String[] args) {
		
		// primitive Datentypen:
		int i = 25; // Integer
		System.out.println(Integer.MAX_VALUE);
		long l = 500000000000L; // Long
		short s = 50; // Short
		byte b = 20; // Byte
		
		double d = 2.5345983; // Double
		float f = 2.5F; // Float

		char ch = 'A'; // Character
		
		boolean bo = true;
		
		// komplexe Datentypen:
		Auto auto = new Auto("Audi");
		String st = "Hallo";
		Color color = new Color(255, 0, 0);
	}
	
}

