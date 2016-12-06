package klassen;

import interfaces.Verkaeuflich;

/**
 * Ein Fahrzeug kann ein {@link PKW}, {@link LKW} oder {@link Motorrad} sein. Fahrzeuge haben einen
 * nicht änderbaren Hersteller und lassen sich tunenen.
 * 
 * Beispiel:
 * {@code Fahrzeug f = new PKW(...);}
 * 
 * {@literal @author wird als normaler Text angesehen.}
 * 
 * @author Pommesfee
 * @version 1.2
 * @since 1.5
 * 
 * @see FahrzeugListe
 * */

public abstract class Fahrzeug implements Verkaeuflich, Cloneable {

	// Statisch | nicht Statisch:
	// Statisch auf nicht statisch geht nicht!!!
	// Nicht statisch auf statisch geht!!!

	// Kostanten
	private static final int DEFAULT_TUNEWERT = 25;

	// Klassen-Variablen(statische Variablen)
	private static int erstellteFahrzeuge = 0;

	static {
		System.out.println("Die Fahrzeug Klasse wurde initialisiert!");
	}

	// Instanz-Variablen (Attribute, Member)
	// <Datentyp> <name> [<Zuweisung>];
	private int preis; // Euro
	private int leistung; // PS
	private String hersteller;

	// Getter
	public int getPreis() {
		return this.preis;
	}

	public int getLeistung() {
		return this.leistung;
	}

	public String getHersteller() {
		return this.hersteller;
	}

	// Setter
	public void setPreis(int preis) {
		this.preis = preis;
	}

	private void setLeistung(int leistung) {
		if (leistung > 0) {
			this.leistung = leistung;
		} else {
			System.out
					.println("Ungültiger Wert für die Leistung! - Programm wird beendet");
			System.exit(-1);
		}
	}

	private void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	// Instanz-Methoden
	// <Rückgabedatentyp> <name> ([<Parameterliste>]) {Rumpf (Logik)}
	/**
	 * Erhöht die Leistung des Fahrzeugs um den angegebenen Wert (PS). Der Wert
	 * muss eine natürliche Zahl sein.
	 * 
	 * @param tuneWert Der Wert um den das Fahrzeug getuned werden soll.
	 * @exception IllegalArgumentException Wenn der Wert keine natürliche Zahl ist.
	 * */
	public void tunen(int tuneWert) {
		if (tuneWert <= 0) {
			throw new IllegalArgumentException(
					"Der tuneWert darf nicht negativ sein!");
		} else {
			leistung += tuneWert;
		}
	}

	public void tunen() {
		tunen(DEFAULT_TUNEWERT);
	}

	// Statische Methode(keine Infos über ein Objekt(für Objektunabhängige
	// Sachen(Dateien laden/Infos anzeigen)))
	public static void printInfos(Fahrzeug fahrzeug) {
		System.out.println("Leistung: " + fahrzeug.getLeistung());
		System.out.println("Hersteller: " + fahrzeug.getHersteller());
	}

	@Override
	public String toString() {
		return "Leistung: " + this.getLeistung() + " Hersteller: "
				+ this.getHersteller() + " Preis: " + this.getPreis();
	}

	public static int getErstellteAutos() {
		return erstellteFahrzeuge;
	}

	// Konstruktoren
	// <KlassenName> (<Parameterliste>) {Rumpf (Logik)}
	public Fahrzeug(int leistung, String hersteller, int preis) {
		setLeistung(leistung);
		setPreis(preis);
		setHersteller(hersteller);
		erstellteFahrzeuge += 1;
		System.out.println("Es wurde soeben das " + erstellteFahrzeuge
				+ ". Fahrzeug erstellt!");
	}

	public Fahrzeug(String hersteller) {
		this(100, hersteller, 0);
	}

	public Fahrzeug() {
		this(100, "null", 00000);
	}

	public abstract void crashtest();

	@Override
	public Fahrzeug clone() {
		Fahrzeug f = null;
		try {
			f = (Fahrzeug) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return f;
	}
}
