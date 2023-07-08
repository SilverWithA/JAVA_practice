package part3.s050;
// >> shift ? 삼항 연산자
public class BitShiftMain {
	//10진수 정수를 2진수 문자열로 변환
	public static String shifts(int a) {
		String s= "";
		for(int i=0;i<=31;i++) {
			int aa = a%2;
			s =(aa>=0)? aa+s:(-aa)+s;
			
			//비트 연산자
			a >>= 1;
		}
		return s;
	}

	public static void main(String[] args) {
		int intnum1 = 123;
		int intnum2 = -123;
		System.out.println(intnum1 + " = " + shifts(intnum1));
		System.out.println(intnum2 + " = " + shifts(intnum2));

	}

}
