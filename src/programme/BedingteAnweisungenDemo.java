package programme;

public class BedingteAnweisungenDemo {

	public static void main(String[] args) {

		int i = 10;
		int j = 25;
		if (i > 0) {
			if (j == 25) {
				System.out.println("I ist positiv und j ist 25!");
			} else {
				System.out.println("I ist positiv und j ist nicht! 25!");
			}
		} else if (i == 0) {
			System.out.println("I ist null!");
		} else {
			System.out.println("I ist negativ!");
		}

		// ...

		// Dangling Else:
		if (i >= 0) {
			if (j > 0) {
				// ...
			}
		} else {
			// ...
		}

	}

}
