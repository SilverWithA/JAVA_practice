package ch05참조타입.sec10;

public class AdvancedFor {

	public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		int[] scores = {30,40,50,60};
		
		int sum=0;
		for(int score: scores) {
			sum = sum+score;
		}
		System.out.println("점수총합: "+ sum);

	}

}
