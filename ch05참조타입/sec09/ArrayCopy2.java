package ch05참조타입.sec09;

public class ArrayCopy2 {

	public static void main(String[] args) {

		String[] oldarr = {"A","B","C"};
		String[] newarr = new String[5];
		
		for(int i=0;i<oldarr.length;i++) {
			newarr[i] = oldarr[i];
		}
		
		for(int i=0;i<5;i++) {
			System.out.print(newarr[i]+ " ");
		}

	}

}
