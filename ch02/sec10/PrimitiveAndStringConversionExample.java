package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		//String to other type 변환
		
		int v1 = Integer.parseInt("10"); //"10"의 문자열을 int로
		double v2 = Double.parseDouble("3.14");
		boolean v3 = Boolean.parseBoolean("true");
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		// 기본타입값 to string 변환: String.valueOf
		String str1 = String.valueOf(10); //10을 문자열로 변환
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		


	}

}
