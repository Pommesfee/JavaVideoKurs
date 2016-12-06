package programme;

import klassen.Dackel;
import klassen.Fahrzeug;
import klassen.PKW;
import klassen.WarenBestand;

public class WarenBestandDemo {

	public static void main(String[] args) {

		Fahrzeug pkw = new PKW(30000);

		Dackel d1 = new Dackel(850);

		WarenBestand.hinzufuegen(pkw);
		WarenBestand.hinzufuegen(d1);

		System.out.println("Die Gesamteinnahmen aus "
				+ WarenBestand.getAnzahlWaren() + " Waren beträgt: "
				+ WarenBestand.berechneGesamtEinnahmen() + " Euro!");

		System.out.println("Anzahl Fahrzeuge im Bestand: "
				+ WarenBestand.getAnzahlFahrzeuge());
		System.out.println("Anzahl Hunde(Dackel) im Bestand: "
				+ WarenBestand.getAnzahlDackel());

	}

}
