package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - pieceUnit * number;
		System.out.println("사과 1개에서 남은 양:"+result);
		// 결과가 0.3이 아님
		// 실수는 부동소수점 방식을 사용하기 때문임.
		// 따라서 정수 연산을 사용해야

	}

}
