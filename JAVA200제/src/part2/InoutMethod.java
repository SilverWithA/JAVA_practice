package part2;
//s025
//키보드로 입력받아 콘솔로 출력하기

import java.util.Scanner;
public class InoutMethod {
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in); // 키보드
		
		System.out.println("정수를 입력하세요.");
		int choice = scann.nextInt(); //키보드로 정수 입력
		
		// java print()안에서는 +로 구문 연결 ,가 아님
		System.out.println("입력한 정수값: " + choice);
		
	
		
		}

}
