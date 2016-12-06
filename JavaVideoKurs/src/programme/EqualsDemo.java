package programme;

import klassen.PKW;

public class EqualsDemo {

	public static void main(String[] args) {
		
		PKW p1 = new PKW(100, "BMW", 20000, 5);
		PKW p2 = new PKW(100, "BMW", 20000, 5);
		
		System.out.println( p1.equals(p2) );
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
	
}
