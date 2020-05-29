package exam01;

import java.util.Scanner;

public class Student01_Manager {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] student = new Student[100];
		int count=0;
		int menu=0;
		while(!(menu==4)) {
			System.out.println("-------------------");
			System.out.println(" 1.입력  2.성적조회  3.전체성적  4.종료");
			System.out.println("-------------------");
			menu= scan.nextInt();
			switch(menu) {
			case 1: 
				System.out.println("이름을 입력하세요");
				String name = scan.nextLine();
				System.out.println("국어성적을 입력하세요");
				int kor = scan.nextInt();
				System.out.println("영어성적을 입력하세요");
				int eng = scan.nextInt();
				System.out.println("수학성적을 입력하세요");
				int math = scan.nextInt();
				student[count]=new Student("홍길동", 86, 78, 95);
				student[count].printResult();
				count++;
				
			}
		}
	}

}







