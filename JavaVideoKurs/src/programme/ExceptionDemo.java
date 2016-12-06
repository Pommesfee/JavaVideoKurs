package programme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

	public static void main(String[] args) {

		String pfad = "C:/settings.txt";
		try {
			dateiAnlegen(pfad);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		try {
//			Object o = null;
//			o.toString();
			checked();
		} catch (NullPointerException e) {
			System.out.println("NPE!");
		} catch (Exception e) {
			System.out.println("Fehler! Aber ist nicht so schlimm...");
		} finally {
			System.out.println("Finally!");
		}

		
	}

	static void checked() throws FileNotFoundException {
		
		FileReader r = new FileReader(new File("C:/xxx.doc"));

		throw new NullPointerException();
	}

	static void dateiAnlegen(String pfad) throws Exception {
		boolean dateiExistiert = true;
		if (dateiExistiert) {
			throw new Exception("Die Datei existiert bereits!");
		}
		// Code, der die Datei anlegt hier...
	}
}
