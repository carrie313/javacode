package exam.If;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int score = scan.nextInt();
		
		switch(score/10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
		case 7:
			System.out.println("aa");
		}
		
	}
}
