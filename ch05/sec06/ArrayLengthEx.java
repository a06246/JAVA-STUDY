package ch05.sec06;

public class ArrayLengthEx {

	public static void main(String[] args) {
		int[] scores = { 1,2,3 };
		
		int sum = 0;
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		double avg = (double) sum / scores.length;
		System.out.println(avg);
		
	}

}
