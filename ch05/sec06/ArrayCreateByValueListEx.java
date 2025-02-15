package ch05.sec06;

public class ArrayCreateByValueListEx {

	public static void main(String[] args) {
		String[] season = { "spring","summer","fall","winter"};
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		season[1] = "여름";
		System.out.println(season[1]);
		
		int[] scores = {1,2,3};
		int sum = 0;
		for (int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		double avg = (double) sum / 3;
		System.out.println(avg);
		
		
	}

}
