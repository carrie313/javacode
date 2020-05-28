package exam.ch05;

public interface AdvancedForExample {
public static void main(String[] args) {
	int[] scores = {39,27,88,59,93};
	int sum=0;
	for(int i=0; i<scores.length; i++) {
		sum=sum+scores[i];
	}
	
	for(int score:scores) {
		sum=sum+score;
	}
//	2차원 배열은
	int[][] sc = {{1,2,3},{4,5,6},{7,8,9}};
//	i행 수 / j열수
	for(int i=0;i<sc.length;i++) {
		for(int j=0;j<sc[i].length;j++) {
			System.out.println(i+"행"+j+"열"+sc[i][j]);
		}
	}
//2차원 받을때 1차원 3차원 받을때 2차원으로
	for(int [] ii : sc) {
		for(int jj : ii) {
			System.out.println(jj);
		}
	}
		}
}
//배열 만들어 놓고 접근하는 방법 확인!! 배열 쓸 때 For문 2가지 방식
//