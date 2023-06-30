package ch07_Inheritance.sec06.package2;
// 다른 패키지에 있는 C
import ch07_Inheritance.sec06.package1.A;

public class C {
	//메소드 선언
	//A의 메소드 접근 불가
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	

}
