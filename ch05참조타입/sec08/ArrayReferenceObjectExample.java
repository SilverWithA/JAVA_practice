package ch05참조타입.sec08;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] ="Java";
		strArray[1] ="Java";
		strArray[2] = new String("Java");
		
		//같은 객체 참조 = true
		System.out.println(strArray[0] == strArray[1]);
		
		//다른 객체 참조 = false
		System.out.println(strArray[0] == strArray[2]);
		
		//문자열 동일 = true
		System.out.println(strArray[0].equals(strArray[2]));
	
	}

}
