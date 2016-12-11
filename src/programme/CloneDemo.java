package programme;

import klassen.Motorrad;
import klassen.Spielstand;

public class CloneDemo {

	static Spielstand aktuellerSpielstand;
	static Spielstand gesicherterSpielstand;

	public static void main(String[] args) {

		aktuellerSpielstand = new Spielstand();
		aktuellerSpielstand.punkte = 1000;
		aktuellerSpielstand.fahrzeug = new Motorrad(120, "Suzuki", 13900);

		// ... Spieler spielt ...

		sichereSpielstand();
		zeigeSpielstände();
		
		aktuellerSpielstand.punkte += 50;
		aktuellerSpielstand.fahrzeug.tunen(200);
		
		zeigeSpielstände();
	}

	public static void sichereSpielstand() {
		// TODO: Aktuellen Spielstand klonen und als gesicherten Spielstand
		// speichern.
		Spielstand klon = aktuellerSpielstand.clone();
		gesicherterSpielstand = klon;
	}

	static void ladeSpielstand() {
		aktuellerSpielstand = gesicherterSpielstand;
	}

	static void zeigeSpielstände() {
		System.out.println("Aktuell: " + aktuellerSpielstand);
		System.out.println("Gesichert: " + gesicherterSpielstand);
	}
}
