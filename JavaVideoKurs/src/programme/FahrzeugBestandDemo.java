package programme;

import klassen.Fahrzeug;
import klassen.FahrzeugBestand;
import klassen.LKW;
import klassen.Motorrad;
import klassen.PKW;

public class FahrzeugBestandDemo {

	public static void main(String[] args) {

		Fahrzeug pkw1 = new PKW();
		pkw1.setPreis(14500);
		Fahrzeug pkw2 = new PKW();
		pkw2.setPreis(39000);
		Fahrzeug pkw3 = new PKW();
		pkw3.setPreis(75000);

		Fahrzeug m1 = new Motorrad();
		m1.setPreis(6000);
		Fahrzeug m2 = new Motorrad();
		m2.setPreis(11000);

		Fahrzeug lkw1 = new LKW();
		lkw1.setPreis(92000);
		Fahrzeug lkw2 = new LKW();
		lkw2.setPreis(114000);

		FahrzeugBestand.hinzufuegen(pkw1);
		FahrzeugBestand.hinzufuegen(pkw2);
		FahrzeugBestand.hinzufuegen(pkw3);
		FahrzeugBestand.hinzufuegen(m1);
		FahrzeugBestand.hinzufuegen(m2);
		FahrzeugBestand.hinzufuegen(lkw1);
		FahrzeugBestand.hinzufuegen(lkw2);

		System.out.println("Die Gesamteinnahmen aus "
				+ FahrzeugBestand.getAnzahlFahrzeuge()
				+ " Fahrzeugen beträgt: "
				+ FahrzeugBestand.berechneGesamtEinnahmen() + " Euro!");

		System.out.println("Anzahl PKWs im Bestand: "
				+ FahrzeugBestand.getAnzahlPKWs());
		System.out.println("Anzahl Motorräder im Bestand: "
				+ FahrzeugBestand.getAnzahlMotorraeder());
		System.out.println("Anzahl LKWs im Bestand: "
				+ FahrzeugBestand.getAnzahlLKWs());
	}

}
