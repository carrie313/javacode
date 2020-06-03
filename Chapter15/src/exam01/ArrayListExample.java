package exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JDBC");
		list.add("database");
		
		System.out.println(list.size());
		System.out.println(list.get(1));
		list.add(1, "study");
		System.out.println(list.get(1));
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		list.remove(0);
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();
		
		list.remove("JDBC");
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

		
		
	}

}
