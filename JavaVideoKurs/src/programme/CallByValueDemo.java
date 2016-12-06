package programme;

import klassen.Auto;

public class CallByValueDemo {

	public static void main(String[] args) {
		
		int a = 10;
		doStuff(a);
		System.out.println("Nach der Methode: " + a);
		
		Auto auto = new Auto(100, "BMW");
		auto = doStuff(auto);
		System.out.println(auto.getLeistung());
	
		doOtherStuff(auto);
		System.out.println(auto.getLeistung());
	}
	
	static void doStuff(int i) {
		i *= 2;
		System.out.println("In der Methode: " + i);
	}
	
	static Auto doStuff(Auto a) {
		a = new Auto(200, "BMW");
		return a;
	}
	
	static void doOtherStuff(Auto a) {
		a.tunen(500);
	}
}
