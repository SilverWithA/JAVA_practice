package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		System.out.print(x);
		

	}

}
