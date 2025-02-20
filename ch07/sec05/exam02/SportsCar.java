package ch07.sec05.exam02;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// 불가능
	@Override
	public void stop() {
		System.out.println("SportsCar stop");
		speed = 0;
	}

}
