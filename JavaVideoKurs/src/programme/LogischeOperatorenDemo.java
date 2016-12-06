package programme;

import klassen.Auto;

public class LogischeOperatorenDemo {

	public static void main(String[] args) {

		// ! (Nicht)
		boolean b = true;
		System.out.println(!b);

		// & (Und)
		boolean b2 = false;
		System.out.println(b & b2);

		// | (Oder)
		System.out.println(b | b2);

		// ^ (exclusives Oder)
		System.out.println(b ^ b2);

		Auto bmw = new Auto(200, "BMW");
		Auto audi = new Auto(120, "Audi");

//		if (Auto.getErstellteAutos() == 2) {
//			if (audi.getLeistung() < 100) {
//				audi.tunen();
//			} else if (audi.getLeistung() < bmw.getLeistung()) {
//				audi.tunen();
//			}
//		}

		// einfacher:
		if (audi != null && Auto.getErstellteAutos() == 2 && (audi.getLeistung() < 100
				| audi.getLeistung() < bmw.getLeistung())) {
			audi.tunen();
		}
		
		// Short Circuit Evaluation && und ||
		int i = 5;
		int j = 15;
		if (i == 10 && j == 15) {
			// ...
		}
	}

}
