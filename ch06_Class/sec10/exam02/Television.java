package ch06_Class.sec10.exam02;

public class Television {
	static String company = "엘지";
	static String model = "LCD";
	static String info;
	
	//정적 블록 for 초기화 작업
	static {
		info= company + "-"+model;
	}

}
