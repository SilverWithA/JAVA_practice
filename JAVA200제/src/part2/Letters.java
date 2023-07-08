package part2;
//s023
public class Letters {
	public static void main(String[] args) {
		char a = '닳';
		String letter = "동해물과 백두산이 마르고 닳도록";
		
		
		//문자열 길이
		int letterNumber = letter.length();
		// 문자 a의 위치: indexOf 사용
		int loc = letter.indexOf(a);
		
		
		// %s: 문자열, %d: 정수, %c: 문자
		System.out.printf("\"%s\" => %d 자이며, '%c'은 %d번째 있다. \n",
				letter,letterNumber,a,loc);
		
		char b = letter.charAt(loc);

	}

}
