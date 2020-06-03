package exam03;

public class Anonymous {
Person field = new Person() {

	@Override
	void wake() {
		// TODO Auto-generated method stub
		super.wake();
	}
	void work() {
		System.out.println("출근합니다.");
	}
	
};

void method1() {
	Person localVar = new Person() {

		@Override
		void wake() {
			// TODO Auto-generated method stub
			super.wake();
		}
		void walk() {
			System.out.println("산책합니다.");
		}
	};
	localVar.wake();
//	localVar.walk(); 부모한테서는 wake 물려받았는데 walk는 추가된거니 접근이 안됨
}
	void method2(Person person) {
		person.wake();
	
}
}
