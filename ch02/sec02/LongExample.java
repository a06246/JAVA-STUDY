package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		// 정수 리터럴(숫자 값만 있는 것)은 기본적으로 int 타입으로 처리
		long var1 = 10;
		// 10은 int로 해석됨. 하지만 자동 변환 덕분에 long으로 해
		long var2 = 20L;
		// long var3 = 10000000000000;
		// 10000000000000은 int 범위를 넘어서기 때문에 오류 발
		long var4 = 1000000000000L;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		// System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
	}

}
