package ch05참조타입.sec05;

public class CharAtExample {
	public static void main(String[] args) {
		
		//주민번호에서 성별정보 뽑기
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch(sex) {
			case '1':
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
	}
	}
}
