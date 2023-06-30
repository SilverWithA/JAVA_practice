package ch07_Inheritance.sec04.exam01;

public class Computer extends Calculator{
	
	//메소드 오버라이딩
	@Override    //컴파일시 오버라이딩이 되었는지 체크해줌(생략가능)
	public double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCirecle() 실행");
		return Math.PI * r * r;

}
}
