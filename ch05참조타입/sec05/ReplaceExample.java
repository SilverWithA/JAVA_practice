package ch05참조타입.sec05;

final class ReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불볍입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);


	}

}
