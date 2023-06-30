package ch07_Inheritance.sec06.package2;

import ch07_Inheritance.sec06.package1.A;

public class D extends A{
	
	//생성자 선언/new연산자로 직접 호출 불가/super()로 A생성자 호출 가능
	
	public D() {
		//A() 생성자 호출
		super();
	}
	
	//A 메소드 선언
	public void method1() {
	//A 필드값 변경
	this.field = "value";
	//A 메서드 호출
	this.method();
	}
	
	//메소드 선언
	public void method2() {
	//직접 객체 생성 사용하는 것 x 
	A a = new A();
	a.field = "value";
	a.method();
	}
}
