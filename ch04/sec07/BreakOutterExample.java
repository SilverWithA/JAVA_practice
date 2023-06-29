package ch04.sec07;

public class BreakOutterExample {

	public static void main(String[] args) {
		// Label이름은 꼭 Outter이 아니어도 ㄱㅊ
		
		Outter: for(char upper='A';upper<='Z';upper++) {
			for(char lower ='a';lower<='z';lower++) {
				System.out.println(upper + " - " + lower);
				if(lower =='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
