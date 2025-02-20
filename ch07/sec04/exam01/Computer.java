package ch07.sec04.exam01;

public class Computer extends Calculator {
	// method overriding
	@Override	// 오버라이딩이 정확히 되었는지 확인
	public double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle(double r) 실행");
		return Math.PI * r * r;
	}

}
