package ch06_Class.sec08.exam1;

public class CalculatorExample {

	public static void main(String[] args) {
		//Calculator 객체 생성
		Calculator myCalc = new Calculator();
		
		//리턴값이 없는 powerOn 메소드 호출
		myCalc.powerOn();
		
		//plus 메소드 호출 시 5와 6의 매기값으로 제공
		//덧셈 결과를 티런받아 result1에 대입
		int result1 = myCalc.plus(5,6);
		System.out.println("result1: "+ result1);
		
		myCalc.powerOff();
		
		

	}

}
