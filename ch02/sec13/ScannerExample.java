package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
	//	throws Exception 추가해야함 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값 입력:");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y값 입력:");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int res = x + y;
		System.out.println("x+y:"+res);
		System.out.println();
		
		while(true) {
			System.out.print("문자열 입력:");
			String data = scanner.nextLine();
			if (data.equals("q")) {
				break;
			}
			System.out.println("문자열 출력:"+data);
			System.out.println();
		}
		
		System.out.println("종료");

	}

}
