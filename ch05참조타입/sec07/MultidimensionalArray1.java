package ch05참조타입.sec07;

public class MultidimensionalArray1 {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores = {
				{80,90,100},
				{50,60}
		};
		System.out.println("1차원 배열 길이: "+ scores.length);
		System.out.println("2차원 배열 길이: "+ scores[0].length);
		System.out.println("2차원 배열 길이: "+ scores[1].length);
		
		System.out.println(scores[0][0]);

}
}
