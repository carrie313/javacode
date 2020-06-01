package exam01;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	public DmbCellPhone(int channel) {

		this.channel = channel;
		System.out.println("DmbCellPhone channel 생성");
	}

	public DmbCellPhone() {
	super("samsung", "red");
	System.out.println("DmbCellPhone 생성");
		
	}

	@Override
	void powerOn() {
		// TODO Auto-generated method stub
		super.powerOn();
		System.out.println("dmb!!");

	}

	@Override
	public String toString() {
		return "DmbCellPhone [channel=" + channel + "]";
	}
}
