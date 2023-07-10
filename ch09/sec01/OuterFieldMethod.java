package ch09.sec01;
//바깥 필드와 메소드에서 중첩 클래스 사용 제한
public class OuterFieldMethod {
	
	//인스턴스 필드 - 인스턴스 멤버, 정적 멤버 클래스의 객체로 가능
	B field1 = new B();
	C field2 = new C();
	
	
	//인스턴스 메서드 - 인스턴스 멤버, 정적 멤버 클래스의 객체로 가능
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	
	//정적 필드 초기화 - 인스턴스 멤버 클래스로 불가, 정적 멤버로는 가능
	//인스턴스 멤버 클래스 객체로 정적 필드 초기화 불가
	//static B field3= new B();
	static C field4 = new C();
	
	//정적 메서드 - 인스턴스 멤버로는 불가, 정적 멤버로는 가능
	static void methid2() {
		//B var1 = new B();
		C var2 = new C();
	}

	
	
	
	//인스턴스 멤버 클래스 B
	class B{}
	//정적 멤버 클래스 c
	static class C{}
}
