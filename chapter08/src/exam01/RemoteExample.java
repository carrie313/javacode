package exam01;

public class RemoteExample {
public static void main(String[] args) {
	Television tv = new Television();
	Radio rd = new Radio();
	Searchable1 rc = new Television1();
//	호출하는 방법이 TV나 Radio나 동일 (다형성)
	
	rc.turnOn();
	rc.turnOff();
	rc.setMute(true);
	
	rc.search1("url");
}
}
