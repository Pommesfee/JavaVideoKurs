package klassen;

public class Auto {

	// Statisch nicht Statisch:
	// Statisch auf nicht statisch geht nicht!!!
	// Nicht statisch auf statisch geht!!!

	// Kostanten
	private static final int DEFAULT_TUNEWERT = 25;

	// Klassen-Variablen(statische Variablen)
	private static int erstellteAutos = 0;

	static {
		System.out.println("Die Auto Klasse wurde initialisiert!");
	}

	// Instanz-Variablen (Attribute, Member)
	// <Datentyp> <name> [<Zuweisung>];
	private int leistung; // PS
	private final String hersteller;

	// Getter
	public int getLeistung() {
		return this.leistung;
	}

	public String getHersteller() {
		return this.hersteller;
	}

	// Setter
	private void setLeistung(int leistung) {
		if (leistung > 0) {
			this.leistung = leistung;
		} else {
			System.out
					.println("Ungültiger Wert für die Leistung! - Programm wird beendet");
			System.exit(-1);
		}
	}

	// Instanz-Methoden
	// <Rückgabedatentyp> <name> ([<Parameterliste>]) {Rumpf (Logik)}
	public void tunen(int tuneWert) {
		if (tuneWert > 0) {
			leistung += tuneWert;
		} else {
			System.out.println("Ungültiger Wert!");
		}
	}

	public void tunen() {
		tunen(DEFAULT_TUNEWERT);
	}

	// Statische Methode(keine Infos über ein Objekt(für Objektunabhängige
	// Sachen(Dateien laden/Infos anzeigen)))
	public static void printInfos(Auto auto) {
		System.out.println("Leistung: " + auto.leistung);
		System.out.println("Hersteller: " + auto.hersteller);
	}

	public static int getErstellteAutos() {
		return erstellteAutos;
	}

	// Konstruktoren
	// <KlassenName> (<Parameterliste>) {Rumpf (Logik)}
	public Auto(int leistung, String hersteller) {
		setLeistung(leistung);
		this.hersteller = hersteller;
		erstellteAutos += 1;
		System.out.println("Es wurde soeben das " + erstellteAutos
				+ ". Auto erstellt!");
	}

	public Auto(String hersteller) {
		this(100, hersteller);
	}
}