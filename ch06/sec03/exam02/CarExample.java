package ch06.sec03.exam02;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("company: "+myCar.company);
		System.out.println("model: "+myCar.model);
		System.out.println("color: "+myCar.color);
		System.out.println("maxSpeed: "+myCar.maxSpeed);
		System.out.println("Speed: "+myCar.speed);
		
		myCar.speed = 60;
		System.out.println("Fixed Speed: "+myCar.speed);
	}

}
