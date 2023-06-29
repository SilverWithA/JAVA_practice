package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		//삼항(조건) 연산자
		int score = 85;
		//(조건식) ? (값1 또는 연산식1) : (값2 또는 연산식2)
		// 조건식이 true이면 값1, false이면 값2이 선택
		char grade = (score>90) ? 'A':((score>80)? 'B':'C');
		System.out.println(score + "은 "+ grade+"듭급입니다.");

	}

}
