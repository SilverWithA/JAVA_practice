package ch05참조타입.sec09;

public class ArrayCopy1 {

	public static void main(String[] args) {
		int[] oldarr = {1,2,3};
		int[] newarr = new int[5];
		
		
		for(int i =0; i<oldarr.length;i++) {
			newarr[i] = oldarr[i];
		}
		
		for(int i=0;i<5;i++) {
		System.out.print(newarr[i]);
		}
	}

}
