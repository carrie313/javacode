package exam01;
//매서드 오버로딩
public class CalExample {
	public static void main(String[] args) {
		Cal cal = new Cal();
		int i = cal.add(34, 27);
		System.out.println(i);
		System.out.println(cal.add(2.0, 8.7));
		System.out.println(cal.add("3","8"));
	}
}
