package ch06_Class.sec09;

//객체 내부에서 인스턴스 멤버에 접근하기 위한 this

public class Car {
	
	//필드 선언
	String model;
	int speed;
	
	//생성자 선언
	Car(String model){
		this.model = model; //매개변수를 필드에 대입(this생략 불가)
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "가 달립니다.(시속: "+this.speed + "km/h)");
	}

}
