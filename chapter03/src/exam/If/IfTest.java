package exam.If;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int count=0;
		
		while(count<=4) {
			
			int com = (int)(Math.random()*6+1);
			System.out.println(com);
			int player = scan.nextInt();

			if(player>=1 && player <=6) {
				if(com==player) {
					System.out.println("정답");
					count=++count;
				}else {
					System.out.println("다음기회에");
				}
			}else {
				System.out.println("숫자범위를 벗어났습니다.");


			}
		}
		System.out.println(count + "번 맞췄습니다.");
	}
}
	
//	if num = 1{
//		System.out.println("1번");
//	}else if  num>=2
//		System.out.println("축하");
	
