package programme;

public class VarArgsDemo {

	public static void main(String[] args) {
		// ...
		System.out.println( addiere(5, 5, 5, 10, 15));
	}
	
	static int addiere(int ersteZahl, int zweiteZahl, int... weitereZahlen) {
		int ergebnis = ersteZahl + zweiteZahl;
		for (int i : weitereZahlen) {
			ergebnis += i;
		}
		return ergebnis;
	}
}
