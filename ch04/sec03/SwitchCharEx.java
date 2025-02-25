package ch04.sec03;

public class SwitchCharEx {

	public static void main(String[] args) {
		String grade = "B";
		
		// Java 11 이전
		int score1 = 0;
		switch (grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		System.out.println("score1: "+score1);
		
		//Java 12 이후
		int score2 = switch (grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				//Java 13 이후
				yield result; //  score2 = result
			}
			default -> 60;
		};
		System.out.println("score2: "+score2);
		
	}

}
