package ch07_Inheritance.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersoniAirplane sa = new SupersoniAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersoniAirplane.SUPERSONIIC;
		sa.fly();
		sa.flyMode = SupersoniAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
