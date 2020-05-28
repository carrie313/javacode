package exam.If;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		int count=0;
		
	while(count<=4) {
		int player = 0;
		
			int com = (int)(Math.random()*6+1);
			System.out.println(com);
			
			String input = scan.nextLine();
			System.out.println(input);
			
			char tmp;
			boolean output = true;
			
			for(int i=0 ; i<input.length();i++) {
				tmp=input.charAt(i);
				
				if(!('0' <=tmp && tmp <='9')) {
					output = false;
				}
			}
			System.out.println("숫자여부: "+output);
			
			if(output == false) {
				System.out.println("잘못된입력입니다!");
			}
			
			else {
				player = Integer.parseInt(input);
				//string으로 받은 문자 int로 변환시켜줌			
//							int player = scan.nextInt();
			}
			
			
			if(player>=1 && player <=6) {
				if(com==player) {
					System.out.println("정답");
					count=++count;
				}else {
					System.out.println("다음기회에");
				}
			}
			else {
				System.out.println("숫자범위를 벗어났습니다.");
				
			
			}
		}
		System.out.println(count + "번 맞췄습니다.");
	}
}
