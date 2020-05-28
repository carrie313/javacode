package exam.ch05;

import java.util.Scanner;

public class Score {
public static void main(String[] args) {
//	10명 학생점수 입력받을 배열 선언;
	int jumsu[] = new int[10];
//	Scanner 이용 배열에 입력 받을 점수 저장
	
	Scanner scan = new Scanner (System.in);

	for(int i=0; i<jumsu.length; i++) {
		System.out.println(i+1+"번째 학생 점수");
		jumsu[i] = scan.nextInt();

	}
	int sum=0;
//	반복문 이용 배열 점수 합
	for(int i=0; i<jumsu.length;i++) {
		sum=sum+jumsu[i];
	}
//	구한 합에 학생수로 나누어 평균
	System.out.println("점수의 합은" + sum);
	System.out.println("점수의 평균은"+(double)sum/jumsu.length);
	System.out.println(jumsu[11]);
//	casting으로 실수값으로 변환
}
}

//class 만들면 학생별로 여러 정보 입력해서 저장 가능

