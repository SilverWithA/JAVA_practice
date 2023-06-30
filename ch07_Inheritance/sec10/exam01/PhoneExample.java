package ch07_Inheritance.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); 추상 클래스 객체 생성 안됨
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		//Phone의 메서드
		smartphone.turnOn();
		
		//SmartPhone의 메서드
		smartphone.internetSearch();
		
		//Phone의 메서드
		smartphone.turnOff();
	}
}
