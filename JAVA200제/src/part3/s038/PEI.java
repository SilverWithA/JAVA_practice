package part3.s038;

public enum PEI {
	PHYSICAL(23), EMOTION(28), INTELL(33);
	
	private final int peiValue;
	PEI(int pie){
		this.peiValue = pie;
	}
	
	
	//enum을 int로 변환
	public int getPei() {
		return peiValue;
	}
	
}

enum FRUIT{
	APPLE,BANANA, MANGO
}
