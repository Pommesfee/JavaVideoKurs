package enums;

public enum Wochentag {

	MONTAG("MONDAY"), DIENSTAG("TUESDAY"), MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;
	
	private final String inEnglish;
	
	private Wochentag(String inEnglish) {
		this.inEnglish = inEnglish;
	}
	
	private Wochentag() {
		this.inEnglish = "NOT DEFINED";
	}
	
	public String getInEnglish() {
		return inEnglish;
	}
}
