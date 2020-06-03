package exam02;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ClassMate implements Comparable<ClassMate>{
	int stunum;
	String name;

	// 생성자 및 toString() 추가	
	public ClassMate(int stunum, String name) {
		super();
		this.stunum = stunum;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ClassMate [stunum=" + stunum + ", name=" + name + "]";
	}

	@Override
	public int compareTo(ClassMate o) {
		
//		return stunum - o.stunum;
//	갖고 있는 stunum에서 들어온 o를 뺌 / 문자열이라면 유니코드 형태로 숫자로 받으니 순서대로 비교 가능함. String에서 compreTo로 수정해서
		return name.compareTo(o.name);  
	}

	
	public Comparator<ClassMate> comparator_name = 
			new Comparator<ClassMate>() {
		
//		public int compare(ClassMate o1, ClassMate o2) {
//			return o1.name.compareTo(o2.name)*-1;
//		}
//	};

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
