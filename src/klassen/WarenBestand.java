package klassen;

import interfaces.Verkaeuflich;

public class WarenBestand {

	private static Verkaeuflich[] waren = new Verkaeuflich[100];

	private static int warenCounter = 0;

	public static void hinzufuegen(Verkaeuflich v) {
		if (warenCounter < waren.length) {
			waren[warenCounter++] = v;
		}
	}

	public static int getAnzahlWaren() {
		return warenCounter;
	}
	
	public static int getAnzahlFahrzeuge() {
		int anzahl = 0;
		for (Verkaeuflich v : waren) {
			if (v instanceof Fahrzeug) {
				anzahl++;
			}
		}
		return anzahl;
	}
	
	public static int getAnzahlDackel() {
		int anzahl = 0;
		for (Verkaeuflich v : waren) {
			if (v instanceof Dackel) {
				anzahl++;
			}
		}
		return anzahl;
	}
	
	public static int berechneGesamtEinnahmen() {
		int total = 0;
		for (Verkaeuflich v : waren) {
			if (v == null) {
				break;
			}
			total += v.getPreis();
		}
		return total;
	}
	
}
