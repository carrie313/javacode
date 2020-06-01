package exam06;
//@data (library 에 어노테이션 정해져 있을수도)
public class Car {
	private int speed; //필드  
	private boolean stop; //T/F 타입
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed>=0 && speed<=350) {
//			값을 체크할 수 있다
		this.speed = speed;
		System.out.println("현재속도" + this.speed);
		}
		else {
			System.out.println("오류");
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", stop=" + stop + "]";
	}
	
	



}
