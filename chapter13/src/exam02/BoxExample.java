package exam02;

public class BoxExample {
public static void main(String[] args) {
	Box<String> box = new Box<>();
//	new 뒷부분 <String 표기> or <> 둘다 가능. 유추가능
	box.setT("홍길동");
	String s = box.getT();
	
	Box <Integer> box1 = new Box<>();
	box1.setT(23);
	int i = box1.getT();
}
}
