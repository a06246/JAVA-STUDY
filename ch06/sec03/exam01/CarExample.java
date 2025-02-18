package ch06.sec03.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("모델: "+myCar.model);
		System.out.println("시동여부: "+myCar.start);
		System.out.println("속도: "+myCar.speed);
	}

}
