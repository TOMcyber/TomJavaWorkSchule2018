package schuleAufgaben052018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AufgabenW4T4 {

	public static void main(String[] args) {
		// ====
		
		List<String> list = new ArrayList<>();
		list.add("Alpha");
		list.add("Beta");
		list.add("Gamma");
		
		System.out.println("vor remove "+list);
		
		while (list.remove("Alpha"));
		//boolean remove = list.remove("Alpha");
		
		System.out.println("nach remove " +list);;
		
		String x = new String("Beta");
		boolean enthalten  = list.contains(x);
		System.out.println(enthalten);
		
		Collections.sort(list);
		int index = Collections.binarySearch(list,  new String("Beta"));
		System.out.println(index);
		
		for (int i = 0; i < list.size(); i++) {
			
		}
		
		

	}

}
