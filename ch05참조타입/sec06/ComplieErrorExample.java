package ch05참조타입.sec06;

public class ComplieErrorExample {

	public static void main(String[] args) {
		
		//변수를 미리 선언 - 값지정: 컴파일에러
		int[] arr1;
		
		//arr1 = {1,2,3,4,5};
		//ComplieErrorExample 발생
		
		arr1 = new int[] {1,2,3,4};
		System.out.println(arr1[0]);
	}
				
		}

