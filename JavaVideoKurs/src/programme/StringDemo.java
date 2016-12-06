package programme;

import java.util.regex.Pattern;

public class StringDemo {

	public static void main(String[] args) {
		
	String hersteller = "BMW";
	String hersteller2 = "BMW";
	
	System.out.println( hersteller == hersteller2 );
	
	String s = "Test";
	s = s.replace("s", "x");
	System.out.println(s);
	
	String regex = "^[1-9][0-9]*,[0-9]{2}$";
	System.out.println(regex);
	
	System.out.println(Pattern.matches(regex, "text"));
	System.out.println("Hallo\\tCiao\nEnde");
	}
}
