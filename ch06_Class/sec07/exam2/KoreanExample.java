package ch06_Class.sec07.exam2;

public class KoreanExample {

	public static void main(String[] args) {
		
		//Korean 객체 생성
		Korean k1 = new Korean("박자바","011225-1234567");
		
		//Koean 객체 데이터 읽기
		System.out.println("k1.nation: "+ k1.nation);
		System.out.println("k1.name: "+ k1.name);
		System.out.println("k1.ssn: "+ k1.ssn);
		
		//또 다른 객체 생성
		Korean k2 = new Korean("김자바","801122-1234123");
		System.out.println("k2.nation: "+ k2.nation);
		System.out.println("k2.name: "+ k2.name);
		System.out.println("k2.ssn: "+ k2.ssn);
		

	}

}
