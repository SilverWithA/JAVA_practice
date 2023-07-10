package ch08_Interface.sec01.exam04;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드
	public void trunOn();
	public void trunOff();
	public void setVolume(int volume);
}

