package ch02.sec01;

public class VariableInitalizationExample {
	public static void main(String[] args){
		//변수 value 선언
		//int value;
		int value = 30;
		
		
		//연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;
		
		//The local variable value may not have been initialized 에러

		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
		
	}
}
