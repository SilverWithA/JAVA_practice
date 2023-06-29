package ch05참조타입.sec07;

public class MultidimensionalArray2 {
	public static void main(String[] args) {
		//new 연산자로 다차원 배열 생성
		//new 타입[1차원수][2차원수]
		
		int[][] scores = new int[2][3];
		String[][] names = new String[2][3];
		
		
		System.out.println(scores[0][0]);
		System.out.println(names[0][0]);
	
	}

}
