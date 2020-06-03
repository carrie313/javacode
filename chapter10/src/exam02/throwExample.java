package exam02;

public class throwExample {
public void method1() {
	try {
		method2();
	}catch(ClassNotFoundException e) {
		System.out.println("클래스 없음");
	}finally {
		System.out.println("finally block");
	}
}
public void method2() throws ClassNotFoundException {
	Class c1= Class.forName("java.lang.String");
}
}
