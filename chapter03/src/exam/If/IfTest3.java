package exam.If;

import java.util.Scanner;

public class IfTest3 {
	public static void main(String[] args) {
		System.out.println("우리는 얼마나 잘 맞을까?");
		System.out.println("홀짝으로 알아보는 우리의 관계!");
		Scanner scan = new Scanner (System.in);

		int count=0;
		for(int i=0;i<3; i++) {

			int num = (int)(Math.random()*9+1);
			System.out.println(num);
			int player = scan.nextInt();

			if(player>=1 && player<=9) {
				if((num+player)%2==0) {
					System.out.println("짝수");
					count=++count;
				}else {
					System.out.println("홀수");
					}
				}
			}
		System.out.println(count +"번 짝수 나왔습니다!");
		
		switch(count){
		case 0:
			System.out.println("우리 사이는 불통");
			break;
		case 1:
			System.out.println("우리 사이는 So So");
			break;
		case 2:
			System.out.println("우리 사이는 꽤 잘맞네");
			break;
		case 3:
			System.out.println("우리 사이는 통통");
		}
		}
	}



