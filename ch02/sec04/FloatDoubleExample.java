package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//정밀도 확인
		float var1 = 0.123456789012345689f;
		double var2 = 0.123456789012345689f;
		System.out.println(var1);
		System.out.println(var2);
		
		
		//10의 거듭제곱 리터럴
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		

	}

}
