package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte res1 = 10 + 20;
		System.out.println("res1:"+res1);
		// 컴파일 단계에서 연
		
		byte v1 = 10;
		byte v2 = 20;
		int res2 = v1 + v2;
		System.out.println("res2:"+res2);
		// int로 변환 후 연산 
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long res3 = v3 + v4 + v5;
		System.out.println("res3:"+res3);
		// long으로 변환 후 연산 
		
		char v6 = 'A';
		char v7 = 1;
		int res4 = v6 + v7;
		System.out.println("res4:"+res4);
		System.out.println("res4:"+(char)res4);
		// int로 변환 후 연산
		
		byte v8 = 10;
		int res5 = v8 / 10;
		System.out.println("res5:"+res5);
		// 결과는 정수 
		
		int v9 = 10;
		double res6 = v9 / 4.0;
		System.out.println("res6:"+res6);
		// double로 변환 후 연산 
		
		int v10 = 10;
		int v11 = 20;
		double res7 = (double) v10 / v11;
		System.out.println("res7:"+res7);
		// double로 변환 후 연산

	}

}
