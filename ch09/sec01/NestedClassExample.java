package ch09.sec01;

public class NestedClassExample {

	public static void main(String[] args) {
		A a = new A();
		
		//인ㅇ스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 1;
		b.method1();
		
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 =2;
		c.method1();
		c.field2 =3;
		c.method2();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
		

	}

}
