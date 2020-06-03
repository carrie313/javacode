package exam02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	
	set.add("java");
	set.add("jdbc");
	set.add("database");
	set.add("java");
	
	System.out.println(set.size());
	
	for (String s : set) {
		System.out.println(s);
	}
	
	Iterator<String> iterator = set.iterator();
	while(iterator.hasNext()) {
		String element = iterator.next();
		System.out.println("\t"+ element);
	}
	
}
}
