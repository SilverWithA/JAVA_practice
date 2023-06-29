package ch06_Class.sec11.exam01;

public class KoreanExample {
	public static void main(String[] args) {
		//객체 생성 시 주민등록 번호와 이름 전달
		Korean k1 = new Korean("123456-1234567","김자바");
		
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//final 필드 값 변경 불가
		//k1.nation = "USA";
		
		//final 필드가 아닌 필드값은 변경 가능
		k1.name = "이자바";
		System.out.println(k1.name);
	}

}
