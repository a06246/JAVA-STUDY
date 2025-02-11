package ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = true;
		if(stop) {
			System.out.println("멈춥니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		int x = 10;
		boolean res1 = (x == 20);
		boolean res2 = (x != 20);
		System.out.println("res1 ="+res1);
		System.out.println("res2 ="+res2);

	}

}
