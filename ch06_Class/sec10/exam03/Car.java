package ch06_Class.sec10.exam03;


//정적 메소드& 정적 블록은 인스턴스 내부 필드나 인스턴스 메소드를 사용할 수 없다.
public class Car {
	
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	static void simulate() {
		//객체 생성
		Car myCar = new Car();
		//정적 블록 에서 인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
	}
	public static void main(String[] args) {
		//정적 메소드 호출
		simulate();
		
		//객체 생성
		Car myCar = new Car();
		//인스턴스 멤버 사용
		myCar.speed =60;
		myCar.run();
	}

}
