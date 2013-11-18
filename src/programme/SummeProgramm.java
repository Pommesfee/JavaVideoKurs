package programme;

public class SummeProgramm {

	public static void main(String[] args) {
		
		String zahl = args[0];
		int i = Integer.parseInt(zahl);
		long ergebnis = berechneSumme(i);
		
		System.out.println(i);
		System.out.println("Die Summe von " + i + " ist: " + ergebnis);
	}
	
	// Rekursion (Methode ruft sich selbst auf)
	static long berechneSumme(int zahl) {
		if (zahl == 1) {
			return 1;
		}
		return zahl + berechneSumme(zahl - 1);
	}
	
}
