package ch05.sec06;

public class ArrayCreateByValueListEx2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {1,2,3};
		
		int sum1 = 0;
		for (int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println(sum1);
		
		printItem(new int[] {4,5,6});
		
	}

	public static void printItem(int[] scores) {
		for (int i=0; i<3 ; i++) {
			System.out.println("scores["+i+"]: "+scores[i]);
		}
	}
}
