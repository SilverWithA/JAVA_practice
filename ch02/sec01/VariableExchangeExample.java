package ch02.sec01;

public class VariableExchangeExample {
	public static void maon(String[] args) {
		int x =3;
		int y=5;
		System.out.println("x:"+x+" y,"+y);
		
		int temp =x;
		x =y;
		y = temp;
		System.out.println("x:"+x+" y,"+y);
	}

}
