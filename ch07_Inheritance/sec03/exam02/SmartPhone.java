package ch07_Inheritance.sec03.exam02;

public class SmartPhone extends Phone{
	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		
	super(model,color); //생략 불가, 반드시 작성
		
	this.model = model;
	this.color =  color;
	System.out.println("SmartPhone(String model, String color) 생성자 실행");
	}
}
