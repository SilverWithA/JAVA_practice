package ch06_Class.sec04;

public class StudentExample {
//Student 라이브러리 클래스
//StudentExample은 실행 클래스 = main() 메소드를 가지고 실행 가능한 클래스
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

	}

}
