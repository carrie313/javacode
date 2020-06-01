package exam06;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();

		//	오류
//		myCar.speed=9;
		myCar.setSpeed(360);
		
		if (!myCar.isStop()) {
			myCar.setStop(true);
			System.out.println("현재 속도:" + myCar.getSpeed());
		}
	}
}
