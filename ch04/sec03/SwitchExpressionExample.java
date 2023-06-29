package ch04.sec03;

public class SwitchExpressionExample {

	public static void main(String[] args) {
		//Switch문에서의 표현식(Expressions)
		//break없이 화살표와 중괄호 사용
		
		char grade = 'B';
		
		switch(grade) {
		case 'A','a' -> {
			System.out.println("우수회원 입니다.");
		}
		case 'B','b' ->{
			System.out.println("일반 회원 입니다.");
		}
		default ->{
			System.out.println("손님입니다.");
		}
		}

		
		
		//중괄호 안 실행문이 하나일때 중괄호 생략 가능
		switch(grade) {
		case 'A','a' -> System.out.println("우수회원 입니다.");
		case 'B','b' -> System.out.println("일반회원 입니다.");
		default -> System.out.println("손님 입니다.");
		
		}
	}

}
