package ch05.sec10;

public class AdvencedForEx {

	public static void main(String[] args) {
		int[] scores = { 1,2,3,4,5 };
		int sum = 0;
		
		for (int score : scores) {
			sum = sum + score;
		}
		
		System.out.println("sum: "+sum);
		double avg = (double) sum / scores.length;
		System.out.println("avg: "+avg);
	}

}
