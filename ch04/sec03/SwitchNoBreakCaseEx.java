package ch04.sec03;

public class SwitchNoBreakCaseEx {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4)+8;
		System.out.println("현재 시간은 "+time+"시 입니다.");
		
		switch (time) {
		case 8:
			System.out.println("출근.");
		case 9:
			System.out.println("회의.");
		case 10:
			System.out.println("업무.");
		default:
			System.out.println("외근.");
		}

	}

}
