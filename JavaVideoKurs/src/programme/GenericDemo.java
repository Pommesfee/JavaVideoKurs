package programme;

import klassen.ArrayUtils;
import klassen.Fahrzeug;
import klassen.Liste;
import klassen.Map;
import klassen.Motorrad;
import klassen.PKW;

public class GenericDemo {

	public static void main(String[] args) {

		// ---------- Liste von Fahrzeugen ----------

		Liste<Fahrzeug> fahrzeugListe = new Liste<Fahrzeug>(100);

		fahrzeugListe.add(new PKW(180, "BMW", 33000, 5));
		fahrzeugListe.add(new Motorrad(110, "Suzuki", 14500));

		System.out.println("Fahrzeuge in der Liste: "
				+ fahrzeugListe.getElementCount());

		Fahrzeug f = fahrzeugListe.get(1);
		System.out.println(f);

		// --------- Liste von String ----------

		Liste<String> herstellerListe = new Liste<String>(25);

		herstellerListe.add("Audi");
		herstellerListe.add("BMW");
		herstellerListe.add("Citroen");

		System.out.println("Hersteller in der Liste: "
				+ herstellerListe.getElementCount());
	
		String hersteller = herstellerListe.get(2);
		System.out.println(hersteller);
		
		// Mapping
		Map<String, String> map = new Map<String, String>();
		
		Liste<String> liste = ArrayUtils.<String>arrayToList(new String[] {"Hallo", "Hi"});
	}

}
