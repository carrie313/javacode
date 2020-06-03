package exam01;

public class Radio implements RemoteControl{

	@Override
	public void turnOn() {
System.out.println("라디오 on");		
	}

	@Override
	public void turnOff() {
System.out.println("라디오 off");		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		RemoteControl.super.setMute(mute);
		System.out.println("radio mute");
//		super 붙는 이유 : 
	}

}
