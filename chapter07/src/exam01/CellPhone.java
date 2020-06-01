package exam01;

public class CellPhone {

	String model;
	String color;
	
	void powerOn() {System.out.println("전원을 켭니다.");}

	public CellPhone() {
		

		System.out.println("CellPhone 생성");
				
	}

	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	
	
}
