package programme;

public class OperatorenDemo {

	public static void main(String[] args) {
		
		//Arithmetische Opertoren:
		System.out.println("Konkatenation: " + (5 + 5.5));
		int i = 10;
		
		System.out.println(-50 -25);
		
		System.out.println(5 * 5);
		
		System.out.println(3 / 4.);
		
		System.out.println(11 % 5);
		
		// Inkrement (++) und Dekrement (--)
		int a = 5;
		a++; // Ist das selbe wie: a = a + 1;
		System.out.println(a);
		
		a--;
		System.out.println(a);
		
		++a;
		System.out.println(a);
		--a;
		System.out.println(a);
		
		int x = 10;
		int y = 10;
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++y);
		
		// ACHTUNG:
		int z = 5;
		z++;
		System.out.println(z);
	}
	
}
