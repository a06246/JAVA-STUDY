package ch04.sec02;

public class IfElseIfElseEx {

	public static void main(String[] args) {
		int score = 75;
		
		if (score >= 90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("A입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80점보다 큽니다.");
			System.out.println("B입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70점보다 큽니다.");
			System.out.println("C입니다.");
		} else {
			System.out.println("점수가 70점 미만니다.");
			System.out.println("D입니다.");
		}

	}

}
