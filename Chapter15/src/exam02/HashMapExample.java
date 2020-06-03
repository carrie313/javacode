package exam02;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
public static void main(String[] args) {
	Map<Student, Integer> map = new HashMap<Student, Integer>();
	
	map.put(new Student(1, "홍길동"), 95);
	map.put(new Student(1, "홍길동"), 95);
	
	System.out.println("총 Entry 수: " + map.size());
//	2개 entry. Key 값 다르다. 오버라이드 안해서 주소값이 다르다
//	override 작업 후엔 entry 2
}
}
