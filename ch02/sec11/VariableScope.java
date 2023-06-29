package ch02.sec11;

public class VariableScope {

	public static void main(String[] args) {
		
		//변수 범위	
		int v1= 15;
		if(v1>10) {
			int v2 = v1 - 10;  //if문 안에서 선언된 v2는 if의 {} 밖에서 사용  x
		}
		int v3 = v1 +v2 + 5; // v2가 정의되지 않아 컴파일 에러 발생
		// v2 cannot be resolved to a variable
	}
}
