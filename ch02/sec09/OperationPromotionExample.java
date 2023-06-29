package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		//연산식에서의 자동 변환
		
	byte result1 = 10+ 20; // 컴파일 단계에서 연산
	System.out.println("result1  " + result1);
	
	byte v1 =10;
	byte v2 = 20;
	int result2 = v1 + v2; //int타입으로 자동변환 후 연산
	System.out.println("result2  "+result2);
	
	byte v3 = 10;
	int v4 = 100;
	long v5 = 1000L;
	long result3 = v3+v4 +v5;//long타입 자동변환 후 연산
		System.out.println("result3  "+result3); 
	

	char v6 = 'A';  //유니코드 65에 해당
	char v7 = 1;
	int result4 = v6+v7; //int타입 자동변환 후 연산
	System.out.println("result4  "+result4);
	
	int v8 = 1;
	int v9 = 2;
	double result5 = (double) v8/v9; //double타입으로 변환후 연산
	System.out.println("result5  "+result5);
	

	}

}
