package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		//비교 연산자
		
		
		float n1 =0.1f;
		double n2 = 0.1;
		boolean result1 = (n1 ==n2);
		boolean result2 = (n1 == (float)n2);
		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		
		
		String str1 = "자바";
		String str2 = "Java";
		boolean result3 = (str1.equals(str2));  //같다
		boolean result4 = (!str1.equals(str2));  //같지 않다
		System.out.println("result3 " + result3);
		System.out.println("result4 " + result4);
		

	}

}
