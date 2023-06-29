package ch05참조타입.sec06;

public class ArrayCreateByValueList2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {80,90,100};
		
		int sum1 = 0;
		for(int i =0;i<3;i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: "+ sum1);
		
		//배열을 매개값으로 주고, printItem()메서드 호출
		printItem( new int[] {80,90,100});
		
	}
	
	public static void printItem(int[] scores) {
		
		//매개변수가 참조한느 배열의 항목을 출력
		for(int i =0; i<3;i++) {
			System.out.println("scres["+ i+ "]:" + scores[i]);
			
		}	
	}
	}


