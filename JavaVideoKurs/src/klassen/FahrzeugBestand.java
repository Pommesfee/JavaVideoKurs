package klassen;

public class FahrzeugBestand {

	private static Fahrzeug[] fahrzeuge = new Fahrzeug[100];

	private static int fahrzeugCounter = 0;

	public static void hinzufuegen(Fahrzeug f) {
		if (fahrzeugCounter < fahrzeuge.length) {
			fahrzeuge[fahrzeugCounter++] = f;
		}
	}

	public static int getAnzahlPKWs() {
		int anzahl = 0;
		for (Fahrzeug fahrzeug : fahrzeuge) {
			if (fahrzeug instanceof PKW) {
				anzahl++;
			}
		}
		return anzahl;
	}
	
	public static int getAnzahlMotorraeder() {
		int anzahl = 0;
		for (Fahrzeug fahrzeug : fahrzeuge) {
			if (fahrzeug instanceof Motorrad) {
				anzahl++;
			}
		}
		return anzahl;
	}
	
	public static int getAnzahlLKWs() {
		int anzahl = 0;
		for (Fahrzeug fahrzeug : fahrzeuge) {
			if (fahrzeug instanceof LKW) {
				anzahl++;
			}
		}
		return anzahl;
	}
	
	public static int getAnzahlFahrzeuge() {
		return fahrzeugCounter;
	}

	public static int berechneGesamtEinnahmen() {
		int total = 0;
		for (Fahrzeug fahrzeug : fahrzeuge) {
			if (fahrzeug == null) {
				break;
			}
			total += fahrzeug.getPreis();
		}
		return total;
	}
}
