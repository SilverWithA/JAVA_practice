package ch07_Inheritance.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		//매개값으로 Bus 객체를 제공하고 dirver() 메소드 호출
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
	}
}
