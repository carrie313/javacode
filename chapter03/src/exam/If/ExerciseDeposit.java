package exam.If;

import java.io.IOException;
import java.util.Scanner;

public class ExerciseDeposit {
public static void main(String[] args) throws IOException {
	
	boolean run = true;
	
	int current = 10000000;
	int keyCode=0;

	Scanner scan = new Scanner(System.in);
	
	while(run) {
		if(keyCode!=13 && keyCode!=10) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 : 2.출금 : 3.종료");
			System.out.println("-----------------------------");
			System.out.println("선택>  ");
		}

		keyCode = System.in.read();

		if (keyCode==49) {
			System.out.println("얼마를 예금하시겠습니까?");
			int deposit = scan.nextInt();
			int balance = current + deposit;
			System.out.println("잔고는" + balance + "원 입니다.");

		}else if (keyCode == 50) {
			System.out.println("얼마를 출금하시겠습니까?");
			int deposit = scan.nextInt();
			int balance = current - deposit;
			System.out.println("잔고는" + balance + "원 입니다.");
			
		}
//		else if (keyCode == 51) {
//			
//			System.out.println("잔고는"+ current + "입니다");
//		}
		
		else if (keyCode ==51) {
			run = false;
		}
		
		
	}
System.out.println("프로그램 종료 \n 부자되세요!");
}

}

