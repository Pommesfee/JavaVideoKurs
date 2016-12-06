package klassen;

public class ArrayUtils {

	public static <X> Liste<X> arrayToList(X[] array) {
		Liste<X> liste = new Liste<X>(array.length);
		for (X x : array) {
			liste.add(x);
		}
		return liste;
	}

	// Wildcards:
	public static int getRemainingSlots(Liste<? extends Object> liste) {
		return liste.getCapacity() - liste.getElementCount();
	}
}
