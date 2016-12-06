package klassen;

public class PKW extends Fahrzeug {

	private int anzahlTueren;

	public int getAnzahlTueren() {
		return anzahlTueren;
	}

	private void setAnzahlTueren(int anzahlTueren) {
		this.anzahlTueren = anzahlTueren;
	}

	public PKW(int leistung, String hersteller, int preis, int anzahlTueren) {
		super(leistung, hersteller, preis);
		setAnzahlTueren(anzahlTueren);
	}

	public PKW(int preis) {
		super(100, "null", preis);
		setAnzahlTueren(5);
	}
	
	public PKW() {
		super();
		setAnzahlTueren(5);
	}

	@Override
	public String toString() {
		return super.toString() + "\nAnzahl Türen: " + this.getAnzahlTueren();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof PKW)) {
			return false;
		}
		PKW o = (PKW)obj;
		if (this.getLeistung() != o.getLeistung()) {
			return false;
		}
		if (this.getPreis() != o.getPreis()) {
			return false;
		}
		if (!(this.getHersteller().equalsIgnoreCase(o.getHersteller()))) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return getLeistung() + getPreis() + 11*getAnzahlTueren() + getHersteller().hashCode();
	}
	
	@Override
	public void crashtest() {
		// TODO Auto-generated method stub
		
	}
}
