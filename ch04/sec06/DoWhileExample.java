package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하라.");
		System.out.println("프로그램 종료 q");
		
		Scanner scanner = new Scanner(System.in);
		String inputStr;
		
		do {
			System.out.println("> ");
			inputStr = scanner.nextLine();
			System.out.println(inputStr);
		} while (!inputStr.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		

	}

}
