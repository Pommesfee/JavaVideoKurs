package klassen;

import interfaces.Verkaeuflich;

public class Dackel extends Hund implements Verkaeuflich {

	private int preis;
	
	@Override
	public int getPreis() {
		return preis;
	}
	
	public Dackel(int preis) {
		this.preis = preis;
	}
	
	@Override
	public String toString() {
		return "Preis: " + this.getPreis();
	}

}
