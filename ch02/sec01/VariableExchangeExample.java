package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("X:"+x+" Y:"+y);
		
		System.out.println("exchange");
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("X:"+x+" Y:"+y);

	}

}
