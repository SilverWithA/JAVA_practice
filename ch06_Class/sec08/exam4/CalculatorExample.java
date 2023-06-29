package ch06_Class.sec08.exam4;

public class CalculatorExample {

	public static void main(String[] args) {
		//객체 생성
		Calculator myCalc = new Calculator();
		
		//정사각형의 넓이 구하기
		double result1 = myCalc.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCalc.areaRectangle(10,20);
		
		System.out.println("result1: "+ result1);
		System.out.println("result2: "+result2);

	}

}
