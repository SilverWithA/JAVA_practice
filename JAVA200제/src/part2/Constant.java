package part2;
//s026
public class Constant {
	
	//상수, 상수값은 변경 불가
	// 상수는 대문자로 선언
	public static final int PHYSICAL = 23; // 상수(개발자 정의)
	public static final void main(String[] args) {
		System.out.println(PHYSICAL);
		int index = PHYSICAL;   //상수값을 변수에 대입
		
		double vals = 2 * Math.PI / index;
		System.out.println(vals + " 리디안");
	}

}
