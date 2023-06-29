package ch05참조타입.sec03;

public class NullPointerException {
	public static void main(String[] args) {
		String refVar1 = "자바";
		String refVar2 = null;
		
		int[] intArray = null;
		//intArray[0] = 10; //NullPointException
		
		String str = null;
		//System.out.println("총 문자 수: " + str.length());
		////NullPointException
	
		
	}

}
