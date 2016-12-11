package programme;

import klassen.Fahrzeug;
import klassen.PKW;

public class toStringDemo {

	public static void main(String[] args) {
		
		Fahrzeug f = new PKW(100, "BMW", 25000, 5);
		System.out.println( f );
		
	}
	
}
