package programme;

public class ArrayDemo {

	public static void main(String[] args) {
		// in Eclipse --> Rechtsklick auf Klasse --> Run As -->
		//  Run Configurations --> Tab: Arguments
		System.out.println(args.length);
		System.out.println(args[0]);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		int x = 10;
		int[] intArray = new int[x];
		intArray[0] = 5;
		intArray[1] = 15;
		intArray[2] = 24;

		intArray = new int[] { 5, 5, 23, 234, 234, 12 };

		String[][] zweiDimArray = new String[2][3];
		zweiDimArray[0] = new String[3];
		zweiDimArray[0][0] = "Hans";
		zweiDimArray[0][1] = "Müller";
		zweiDimArray[0][2] = "555 333";
		zweiDimArray[1] = new String[6];

		int[][][] dreiDimArray;
	}

}
