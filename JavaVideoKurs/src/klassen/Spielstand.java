package klassen;

public class Spielstand implements Cloneable {

	public int punkte;
	public Fahrzeug fahrzeug;

	@Override
	public String toString() {
		return "Spielstand [punkte=" + punkte + " fahrzeug="
				+ fahrzeug.toString() + "]";

	}

	@Override
	public Spielstand clone() {
		Spielstand klon = null;
		try {
			klon = (Spielstand) super.clone();
			klon.fahrzeug = fahrzeug.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return klon;
	}
}
