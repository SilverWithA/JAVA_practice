package ch08_Interface.sec01.exam06;

public interface RemoteControl {
	
	//상수 필드 선언
	public int MAX_VOLUME  = 10;
	public int MIN_VOLUME   = 0;
	
	//추상 메소드
	public void trunOn();
	public void trunOff();
	public void setVolume(int volume);

}
