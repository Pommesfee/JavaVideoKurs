package programme;

import klassen.PKW;

public class FahrzeugDemo {

	public static void main(String[] args) {
	
			PKW pkw = new PKW();
			pkw.tunen(-80);
			System.out.println(pkw.getLeistung());
	}

	
}
