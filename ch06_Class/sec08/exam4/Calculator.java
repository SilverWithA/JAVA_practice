package ch06_Class.sec08.exam4;

public class Calculator {
	//오버로딩: 메소드 이름이 같되 매개변수가 다를 때
	
	
	//정사각형의 넓이 구하기
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}

}
