package exam04;

public abstract class Phone {
	public String owner;
	//생성자
	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	//매소드
	public void turnOn() {
		System.out.println("전원 on");
	}
	public void turnOff() {
		System.out.println("전원 off");
	}
	
	public abstract void bellOn();
	//중괄호 없는 추상매서드 class도 추상이 됨
	
}
