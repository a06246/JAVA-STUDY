package ch06.sec08.exam01;

public class Calculator {
	void powerOn() {
		System.out.println("power on");
	}
	
	void powerOff() {
		System.out.println("power off");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide (int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
}
