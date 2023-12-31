package ch03.sec01;

public class IncreaseDecreseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x= " + x);
		System.out.println("-----------------------");
		
		y--;
		--y;
		System.out.println("y= " + y);
		System.out.println("-----------------------");
		
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("-----------------------");
		
		z= ++x + y++; //y++은 연산을 마치고 y에 1추가
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);

	}

}
