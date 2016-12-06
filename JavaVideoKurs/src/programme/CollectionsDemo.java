package programme;

import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(20);
		list.add(1, 10);
		System.out.println(list.get(2));
		System.out.println(list.size());
		System.out.println(list.contains(12));
		
		for (Integer i : list) {
			System.out.println(i);
		}
	}
	
}
