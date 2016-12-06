package programme;

import enums.Wochentag;

public class WochentagAnalyse {

	public static void main(String[] args) {
		
		Wochentag montag = Wochentag.MONTAG;
		Wochentag mittwoch = Wochentag.MITTWOCH;
		Wochentag freitag = Wochentag.FREITAG;
		analysiereWochentag(montag);
		analysiereWochentag(mittwoch);
		analysiereWochentag(freitag);
	}
	
	private static void analysiereWochentag(Wochentag tag) {
		System.out.print(tag.toString() + " ist: ");
		switch (tag) {
		case MONTAG:
			System.out.println("Schlimm!");
			break;
		case FREITAG:
			System.out.println("Toll!");
			break;
		case SAMSTAG:
			System.out.println("Super!");
			break;
		case SONNTAG:
			System.out.println("Ziemlich gut!");
			break;
		default:
			System.out.println("So la la...");
			break;
		}
	}
	
}
