package programme;

import klassen.Auto;

public class AutoProgramm {

	// Konstanten
	private static final double VERSION = 0.1;
	private static final String BUILD = "a";

	public static void main(String[] args) {

		System.out.println("Das Programm wurde gestartet! Version: "
				+ getVersion() + getBuild());

		Auto bmw = new Auto(150, "BMW");
		Auto audi = new Auto(100, "Audi");

		// Punktnotation
		bmw.tunen();

		Auto.printInfos(bmw);
		Auto.printInfos(audi);

	}

	public static double getVersion() {
		return VERSION;
	}

	public static String getBuild() {
		return BUILD;
	}
}
