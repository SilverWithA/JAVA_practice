package ch07_Inheritance.sec09;

public class Student extends Person{
	
	public int studentNo;
	
	public Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
	//메소드 선언
	public void study() {
		System.out.println("공부를 합니다.");
	}

}
