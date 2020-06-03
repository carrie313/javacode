package exam02;

public class Test {
public static void main(String[] args) {
	Object obj = new Object();
	
	System.out.println(obj);
	System.out.println(obj.toString());
	
	System.out.println(obj.hashCode());
	
	System.out.println(Integer.toHexString(obj.hashCode()));
//	obj 객체의 hashcode 10진수를 받아 16진수로 출력

	

}
}
