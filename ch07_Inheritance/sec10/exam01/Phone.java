package ch07_Inheritance.sec10.exam01;

public abstract class Phone {
	String owner;
	
	Phone(String owner){
		this.owner = owner;
	}
	
	void turnOn() {
		System.out.println("전원On");
	}
	
	void turnOff() {
		System.out.println("전원Off");
	}
	
	

}
