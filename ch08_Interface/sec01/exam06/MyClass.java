package ch08_Interface.sec01.exam06;

import ch08_Interface.sec01.exam03.RemoteControl;

//개발코드: Myclass
//구현 객체: Television, Audio
//인터페이스(RemoteControl)는 개발코드와 구현 객체 사이 접점 역할 담당

public class MyClass {
	
	//필드
	//필드에 구현 객체(new Television) 대입 가능
	RemoteControl rc = new Television();
	
	//생성자
	//생성자의 매개 변수 타입으로 구현 객체를 대입 가능
	MyClass(RemoreControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드
	RemoteControl rc = new Audio();
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드의 매개 변수 타입으로 구현 객체 대입 가능
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
