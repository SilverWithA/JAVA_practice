package part3.s034;
//삼항 연산자 () ? :
public class EvenOdd {

	public static void main(String[] args) {
		int temp = 99;
		
		//temp가 홀수이면 +1, 짝수이면 -1 연산
		temp = (temp%2 ==1) ? temp+1:temp-1;
		System.out.printf("계산 후 = %d\n", temp);
	}

}
