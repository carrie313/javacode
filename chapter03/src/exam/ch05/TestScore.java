package exam.ch05;

import java.util.Scanner;

public class TestScore {
public static void main(String[] args) {
	

	Scanner scan = new Scanner(System.in);
	
	int score [][] = new int[10][3];
	int studentNum = 0;
	int subNum =3;
	String subject[] = {"국어", "영어", "수학"};
	double avg = 0.0;
	double totAvg =0.0;
	
	System.out.println("학생수  :");
	studentNum = scan.nextInt();
	
	System.out.println();
	
	int clsNum[][] = new int[studentNum][subNum+1];
	String studentName[] = new String[studentNum];
	
	for(int i=0; i<clsNum.length; ++i) {
		System.out.println((i+1) + "번째 학생 이름: ");
		studentName[i] = scan.next();
		
		System.out.println("국어 점수 :");
		clsNum[i][0] = scan.nextInt();
			
		System.out.println("영어 점수 :");
		clsNum[i][1] = scan.nextInt();
		
		System.out.println("수학 점수:");
		clsNum[i][2] = scan.nextInt();
		
		clsNum[i][clsNum[0].length-1] = clsNum[i][0] +clsNum[i][1] + clsNum[i][2];
		
		
			
		int tot =0;

		for(int j=0;j<score[i].length-1;j++) {

		}
	}
}
}




