package ch05.sec07;

public class MultidimensionalArrayByNewEx {

	public static void main(String[] args) {
		int[][] scores = {
				{1,2,3},
				{4,5}
		};
		
		System.out.println("1차 배열 길이: "+scores.length);
		System.out.println("2차 1행 배열 길이: "+scores[0].length);
		System.out.println("2차 2행 배열 길이: "+scores[1].length);
		
		System.out.println("[0][2]: "+scores[0][2]);
		System.out.println("[1][1]: "+scores[1][1]);
		
		int class1Sum = 0;
		for (int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		System.out.println("1반 합: "+class1Sum);
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("1반 평균: "+class1Avg);
		
		int class2Sum = 0;
		for (int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		System.out.println("2반 합: "+class2Sum);
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("2반 평균: "+class2Avg);
		
		int totalStudent = 0;
		int totalSum = 0;
		for (int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for (int k=0; k<scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		System.out.println("전체 학생 수: "+totalStudent);
		System.out.println("전체 합: "+totalSum);
		
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 평균: "+totalAvg);
		
	}

}
