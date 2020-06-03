package exam04;


import java.util.Comparator;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public Student(int id, String name, int kor, int eng, int math) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total="
				+ total + ", avg=" + avg + "]";
	}


	//기본-학생번호 순서로 정렬 되도록 
	@Override
	public int compareTo(Student o) {

		return id - o.id;
	}


	//총점 순으로 정렬하도록
	public static Comparator<Student> sortTotal = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getClass(total).compareTo(o2.getClass(total));
			
		}
	};



}

