package ch07_Inheritance.sec02;

public class SmartPhoneExample {
	public static void main(String[] args) {
		//SmartPhone 객채 생성
		SmartPhone myPhone = new SmartPhone("갤럭시","은색");
		
		//Phone으로부터 상속받은 필드 읽기
		System.out.println("모델: "+ myPhone.model);
		System.out.println("색상: "+ myPhone.color);
		
		
		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태: "+ myPhone.wifi);
		
		//Phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요.");
		myPhone.receiveVoice("zzz");
		myPhone.sendVoice("일어나세요");
		myPhone.hangUp();
		
		//SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
		
	}

}
