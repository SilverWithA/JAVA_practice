package ch04.sec08;

class ContinueExample {

	public static void main(String[] args) {
		//1~10까지 홀수가 출력되지 않는 반복문
		
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue;
			}
		System.out.println(i + " ");	
		}
	}
}
