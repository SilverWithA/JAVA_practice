package ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		//논리 연산자: AND, OR, XOR, NOT
		int charCode = 'A';
		
		if ((65<=charCode)& (charCode <=90)) {
			System.out.println("대문자군요.");
		}
		
		if ((97<=charCode)& (charCode <=122)) {
			System.out.println("소문자군요.");
		}
		if ((48<=charCode)& (charCode <=57)) {
			System.out.println("0~9 숫자군요.");
	}
//------------------------------
		int value = 6;
		
		if((value%2==0)|(value%3==0)) {
			System.out.println("2 또는 3의 배수군요.");
		}
		
		boolean result =(value% 2==0) || (value%3 ==0);
		if (!result) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
}
}
