package part2;
//s024
public class Hello {
	// static으로 메서드 선언해서 객체 생성없이 showHello() 호출 가능
	public static void showHello() {
		System.out.println("************************************************");
		System.out.println(" 오늘은 토요일입니다. 애플 시나몬 와플 시켜 먹고 집에 갈겁니다. ");
		System.out.println("************************************************");
		
	}
	
	// 객체 없이 showHello 메서드 호출
	public static void main(String[] args) {
		showHello();

	}

}
