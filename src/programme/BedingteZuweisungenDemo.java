package programme;

public class BedingteZuweisungenDemo {

	public static void main(String[] args) {

		String s;
		String x;
		int j = 10;
		if (j % 2 == 0) {
			s = "Zahl gerade";
		} else {
			x = "Zahl ungerade";
		}

		// Konditionaloperator
		s = j % 2 == 0 ? "Zahl gerade" : "Zahl ungerade";

		s = j % 2 == 0 ? j == 0 ? "Zahl gerade (null)" : "Zahl gerade"
				: "Zahl ungerade";
		
		int a = 0;
		if (a == 0) {
			System.out.println(":)");
		}else {
			System.out.println(":(");
		}
		
		System.out.println(a == 0 ? ":)" : ":(");
	}

}
