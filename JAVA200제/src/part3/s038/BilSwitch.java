package part3.s038;

public class BilSwitch {
	
	//메서드 선언
	public static String textInfor(PEI index, double value) {
		String result ="";
		switch(index) {
		case PHYSICAL : result = "신체지수: "; break;
		case EMOTION: result = "감성지수: "; break;
		case INTELL: result = "지능지수: "; break;
		default: result = "미결정: "; break;
		}
		return result +(value *100);
	}

	public static void main(String[] args) {
		PEI index = PEI.PHYSICAL;
		double value = 0.86;
		
		//enum을 int로 변환
		System.out.println("신체 지수 주기 값: "+ index.getPei());
		
		
		
		String st = textInfor(index, value);
		System.out.println(st);
		//PHYSICAL 선언 순서: ordinal()
		System.out.println("index: "+ index);
		System.out.println("index 선언 순서: "+index.ordinal());
		System.out.println("index 이름: "+ index.name());
		System.out.println("index 정수값: "+ index.getPei());
	}

}
