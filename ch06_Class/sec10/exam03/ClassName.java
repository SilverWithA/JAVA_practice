package ch06_Class.sec10.exam03;
//정적 메소드& 정적 블록은 인스턴스 내부 필드나 인스턴스 메소드를 사용할 수 없다.
public class ClassName {
	
	//인스턴스 필드와 메소드 선언
	int field1;
	void method1() {	}
	
	//정적 필드와 메소드 선언
	static int field2;
	static void method2(){   }
	
	//정적 블록 선언
	static {
	    //field1 = 10; //컴파일 에러
	    //method1();   //컴파일 에러
		field2 =10;
		method2();
	}
	
	//정적 메소드 선언
	static void method3() {
		//this.field1 = 10;  //컴파일 에러
		//this.method1();    //컴파일 에러
		field2 = 10;
		method2();
		
		//정적 메소드나 정적 블로에서 인스턴스 멤머 사용하고 싶다면 객체 선생성 필요
//		static void method3() {
//			ClassName obj = new ClassName();
//			//인스턴스 멤버 사용
//			obj.field1 = 10;
//			obj.method1();

	}
}

