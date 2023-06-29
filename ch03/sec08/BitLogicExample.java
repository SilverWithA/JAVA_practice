package ch03.sec08;

public class BitLogicExample {
	public static void main(String[] args) {
		//비트 논리 연산자
		//피연산자: 2진수 0과 1이므로 float,double은 피연산자 x
		//최상위 비트가 1이면 음수를 표현
		
		System.out.println("45 & 25 = "+ (45%25)); //AND
		System.out.println("45 | 25 = "+ (45|25)); //OR
		System.out.println("45 ^ 25 = "+ (45^25)); //XOR
		System.out.println("~45 = "+ (~45));
		System.out.println("-------------------------------");
		
		
		byte receiveData = -120;
		
		//방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		//방법2: 자바 API를 이용해 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
		
		
		

	}

}
