package javapractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsEX {

	public static void main(String[] args) {

		// List , Set, Map

		// List
		// stores data in Indexed - sequential
		// duplicates allowed

		List<Integer> li = new ArrayList();

		li.add(101);
		li.add(102);
		li.add(103);

		// System.out.println(li.get(0));
		// System.out.println(li.get(2));

		for (int j = 0; j <= li.size() - 1; j++) {

			System.out.println(li.get(j));
		}
		
		// Advanced for loop/ for each loop
		
		for (int j : li) {
			
			System.out.println(j);
		}
		

		// Set
		// does not store data in indexed-sequential order
		// Duplicates not allowed

		Set<String> s = new HashSet();
		
		s.add("Mital");
		s.add("Hetal");
		s.add("Deepika");
		s.add("Shivani");
		s.add("Vaishali");
		s.add("Bhavna");
		s.add("Mital");
		s.add("Hetal");
		s.add("Deepika");
		
		for (String j : s) {

			System.out.println(j);
		}
		
		
		

	}

}
