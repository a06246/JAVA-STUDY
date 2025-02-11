package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		int val = 123;
		
		System.out.printf("상품 가격:%d원\n", val);
		System.out.printf("상품 가격:%6d원\n", val);
		System.out.printf("상품 가격:%-6d원\n", val);
		System.out.printf("상품 가격:%06d원\n", val);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%010.2f\n", 10, area);
		
		String name = "김은아";
		String age = "25";
		System.out.printf("| %6d | %-10s | %10s |\n", 10, name, age);
	}

}
