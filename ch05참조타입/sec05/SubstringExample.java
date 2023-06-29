package ch05참조타입.sec05;

public class SubstringExample {
	public static void main(String[] args) {
		String ssn = "880505-1230123";
		String firstNum = ssn.substring(0,6); //0부터 6번째까지
		String secondNum = ssn.substring(7); // 7번째부터 마지막까지
		
		
		System.out.println(firstNum);
		System.out.println(secondNum);
	}

}
