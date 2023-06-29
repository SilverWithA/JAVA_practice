package ch04.sec04;

public class FloatCountExample {

	public static void main(String[] args) {
		
		//for문 주의점: 초기화식에서 부동 소수점 float타입은 사용x
		// 이론적으로 다음의 for문은 10번 반복해야한다.
		// float타입이 0.1을 정확히 표현x 실제로 더해지는 값이 0.1보다 약간 커짐
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}

	}

}
