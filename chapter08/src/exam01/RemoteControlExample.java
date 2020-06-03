package exam01;

public class RemoteControlExample {
public static void main(String[] args) {
	RemoteControl rc = new RemoteControl() {
//		익명이라 이름 없어서 rc 저장 안해놓으면 못씀
		@Override
		public void turnOn() {
System.out.println("일회용 전원 on");			
		}
		
		@Override
		public void turnOff() {
System.out.println("일회용 전원 off");			
		}
		
		@Override
		public void setVolume(int volume) {
System.out.println("볼륨조절");			
		}
	};
//	구문이니 세미콜론
	rc.turnOn();
	rc.turnOff();
//	interface implement해서 만들어진거라 익명이라도 호출은 똑같음.표준화를 위해 interface 사용

}
}
