package exam02.package3;

public class PromotionExample {
public static void main(String[] args) {
	A a = new A();
	A ab = new B();
	A ac = new C();
	A ad = new D();
	A ae = new E();
	
//큰타입에서 작은타입으로는 못넣어 캐스팅 필요
//	B b = (B) ab;
//	B bd = new D();
//
//	ab.method();

	
	if(ac instanceof A) {
		System.out.println("A");
	}else {
		System.out.println("아님");
	}
}
}
