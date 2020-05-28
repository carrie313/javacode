package exam.ch05;

import java.util.Scanner;

public class TestScore2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int student [][] = new int [3][3];
	int stuTotal=0;
	double stuAvg=0.0;
	int menu =0;
	while(!(menu==3)) {
	System.out.println("--");
	System.out.println("1. 입력  2. 성적처리 3. 종료");
	System.out.println("--");
	System.out.println("메뉴선택>>");
	
	menu=scan.nextInt();
	switch(menu) {
	case 1:
		for(int i=0; i<student.length; i++) {
			System.out.println(i+1+"번 학생 성적입력(국영수)");

		}
	break;
	
	case 2:
		for(int i=0; i<student.length; i++) {
			int total = student[i][0]+student[i][1]+student[i][2];
			stuTotal=stuTotal+total;
	
			System.out.println(i+1+"번 학생 총점"+total);
			System.out.println(i+1+"번 학생 평균"+(total/3.0));
			System.out.printf("%d번 학생 평균은 %.2f", i+1, total/3.0);
		}
		}
	}
	
	
}
}
