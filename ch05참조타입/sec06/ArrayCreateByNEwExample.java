package ch05참조타입.sec06;

public class ArrayCreateByNEwExample {

	public static void main(String[] args) {
		//new연산자를 이용한 배열생성
		int[] arr1 = new int[3];
		
		//배열 항목의 초기값 출력
		//int[]는 초기값 0임
		for(int i=0;i<3;i++) {
		System.out.print("arr1[" + i + "]:"+arr1[i]+", ");
		
		}
		System.out.println();
		String[] arr2 = new String[3];
		
		//배열 항목의 초기값 출력
		//String[]는 초기값 null임
		
		for(int i=0;i<3;i++) {
		System.out.print("arr2[" + i + "]:"+arr2[i]+", ");

	}
}
}
