package ch05참조타입.sec05;

public class SplitExample {

	public static void main(String[] args) {
		
		String board = "1,자바 학습,집에가고싶다., 홍길동";
		//문자열 분리
		String[] tokens = board.split(",");
		
		//인덱스별로 읽기
		System.out.println("번호: " + tokens[0]);
		System.out.println("제목: " + tokens[1]);
		System.out.println("할말: " + tokens[2]);
		System.out.println("성명: " + tokens[3]);
		
		//for문을 이용한 읽기
		//for(int i =0; i<tokens.length;i++){
//		System.out.println(tokens[i]);
//	}
		
		
	}

}
