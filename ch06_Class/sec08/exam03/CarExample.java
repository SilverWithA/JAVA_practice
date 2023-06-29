package ch06_Class.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		if(myCar.isLeftGas()) {
			System.out.println("출발");
			
			myCar.run();
		}
		System.out.println("gas를 주입해주세요");

	}

}
