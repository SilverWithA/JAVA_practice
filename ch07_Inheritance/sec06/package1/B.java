package ch07_Inheritance.sec06.package1;

//A와 같은 패키지 B에서는 접근 가능
public class B {
	
	//메소드 선언
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}

}
