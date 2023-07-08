package part3.s055;
//가변인자 varargs 사용해보기
public class ForeachLotto {
	
	//var args variable arguments
	public static void print(int ...mm){
		for(int m:mm) {
			System.out.printf(m+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] mm = {1,6,16,22,23,33};
		print(mm); //가변인자를 사용해 배열처럼
		
		int a =10, b=60, c =160;
		print(a);   //  1개짜리 배열
		print(a,b); // 2개짜리 배열
		print(a,b,c); // 3개짜리 배열
	}
}
