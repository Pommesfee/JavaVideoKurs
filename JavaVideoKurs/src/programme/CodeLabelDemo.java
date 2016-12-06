package programme;

public class CodeLabelDemo {

	public static void main(String[] args) {

		meinLabel: for (int k = 0; k <= 10; k++) {

			zweitesLabel: for (int i = 0; i < 10; i++) {
				System.out.println("k = " + k + " i = " + i);
				if (k == 5 && i == 5) {
					continue meinLabel;
				}
			}

		}

	}

}
