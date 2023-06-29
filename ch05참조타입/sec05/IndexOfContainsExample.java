package ch05참조타입.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject= "자바 프로그래밍";
		
		//문자열 위치 
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		//어떤 위치에 문자열 자르기
		String substring = subject.substring(location);
		System.out.println(substring);
		
		//포함 여부
		boolean result = subject.contains("자바");
		System.out.println(result);
		

	}

}
