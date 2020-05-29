package exam01;

public class Car {
	//필드
	String company;
	String Model;
	String color;
	int maxSpeed;
	int speed;
	int rpm;
	int mynumber;
	static int number=0;
	//	static 붙은건 class당 하나만 만든다	



	//	생성자
	//	public Car(String company) {
	//		super();
	//		mynumber=++number;
	//		this.company = company;
	////		바깥에서 받아서 class의 company에.

	// TODO Auto-generated constructor stub

	public Car(String company, String model, String color, int maxSpeed, int speed, int rpm, int mynumber,
			boolean starter) {
		super();
		this.company = company;
		Model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		this.rpm = rpm;
		this.mynumber = mynumber;
		this.starter = starter;
	}




	//
	//	public Car(String company, String model, int maxSpeed, int speed, int rpm) {
	//		super();
	//		this.company = company;
	//		Model = model;
	//		this.maxSpeed = maxSpeed;
	//		this.speed = speed;
	//		this.rpm = rpm;
	//	}

	public Car(String company, String model, String color, int maxSpeed, int speed, int rpm, boolean starter) {
		super();
		this.company = company;
		Model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		this.rpm = rpm;
		this.starter = starter;
	}




	boolean starter;



	//	속도 가져다가 내보내고 리턴해줄때는 int 아니면 void
	//	메소드 영역
	//	add return speed /speed값을 int로 내보내준다 리턴시켜준다
	int speedUp(int speed) {
		speed=speed+10;
		return speed;
	}
	//	리턴없이 바로 speed값 처리
	void speedDown(int speed) {
		this.maxSpeed=speed-10;
	}

	//	나가는건 있는데 들어오는게 없음
	int speedUp() {
		return speed;
	}

	//	나가는것 들어오는것 둘다없음 (시동 켜고 끄는거)
	//	void speedUp() {
	void speedDown() {

	}	

	void starterOnOff() {
		starter=!starter;
	}



	int sum(int ... values) {
		int result = 0;
		for(int i=0; i<values.length; i++) {
			result=result + values[i];
		}
		return result;

	}
//	speedDown(result);
////매서드호출 위치에 따라 달라짐
//	}
	
}


