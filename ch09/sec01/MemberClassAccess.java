package ch09.sec01;

public class MemberClassAccess {
	int field1;
	void method1() {};
	
	static int field2;
	static void method2() {}
	
	
	//인스턴스 멤버 클래스
	class B{
		void method() {
			
			//바깥 클래스의 모든 필드와 메소드에 접근 가능
			field1 = 10;
			method1();
			
			field2 = 20;
			method2();
	}
}
	
	//정적 멤버 클래스
	static class C{
		void method() {
			
			//바깥 클래스의 인스턴스 필드와 인스턴스 메서드 접근 불가
			//fiedl1 = 10;
			//method1();
			
			field2 = 20;
			method2();
		}
	}
}