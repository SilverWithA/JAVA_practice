package ch05참조타입.sec05;

public class LengthExample {

	public static void main(String[] args) {
		String ssn ="850610-1230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		}else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}

	}

}
