package exam02;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		super();//부모생성자 만드는 건데 없어도 작동
		this.sno = sno;
		this.name = name;
		
		
		
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student)obj;
//			들어오는게 Student 타입인지 체크하고 넣어준다
			return sno ==stu.sno && name.equals(stu.name);
//			자기가 갖고 있는 sno과 들어온 stu.name 비교
		}else {
			return false;
		}
		
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
	
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

	
	

}
