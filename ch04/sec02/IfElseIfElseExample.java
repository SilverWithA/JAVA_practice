package ch04.sec02;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		//else if: 상위 if조건문에 true이면 실행x
		
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 90~100점 입니다.");
		}else if(score >=80){
			System.out.println("점수가 80~89점 입니다.");			
		}else if(score>=70) {
			System.out.println("점수가 70~79점 입니다.");
		}else {
			System.out.println("점수가 70미만 입니다.");
		}
	}
}
