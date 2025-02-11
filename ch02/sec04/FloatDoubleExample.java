package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// 정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		System.out.println("var1 : " + var1);
		System.out.println("var1 : " + var2);
		// double이 2배 정도 정확도가 높음
		
		// 10의 거듭제곱 리터럴
		float var3 = 3e6F;
		double var4 = 3e6;
		double var5 = 2e-3;
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
				

	}

}
