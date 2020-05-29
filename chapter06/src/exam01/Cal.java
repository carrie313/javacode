package exam01;

public class Cal {
	double result;
//	실수값도 있을수 있으니 나누기때문에 double
	
	int add(int a, int b){
		return a+b;
	}
//	이름은 같고 매개변수 형태는 달라야 함
	double add(double a, double b) {
		return a+b;
	}
	
	int add(String a, String b) {
		return Integer.parseInt(a) + Integer.parseInt(b);
	}
	
}
