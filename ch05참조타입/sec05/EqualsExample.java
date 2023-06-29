package ch05참조타입.sec05;

public class EqualsExample {
	public static void main(String[] args) {
		String v1 = "홍길동";
		String v2 = "홍길동";
		
		if(v1 == v2) {
			System.out.println("v1과 v2의 참조가 같음.");
		}else {
			System.out.println("v1과 v2의 참조가 다름.");
		}
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2의 문자열이 같음.");
		}
		
		
		//new 연산자 사용
		String v3 = new String("홍길동");
		String v4 = new String("홍길동");
		
		if(v3 == v4) {
			System.out.println("v3과 v4의 참조가 같음.");
		}else {
			System.out.println("v3과 v4의 참조가 다름.");
		}
		
		if(v3.equals(v4)) {
			System.out.println("v3과 v4의 문자열이 같음.");
		}
		
	}

}
