package ch05.sec07;

public class MultidimensionalArrayByValueListEx {

	public static void main(String[] args) {
		int[][] mathScore = new int[2][3];
		
		for (int i=0; i<mathScore.length;i++) {
			for (int k=0; k<mathScore[i].length; k++) {
				System.out.println("mathScore["+i+"]["+k+"]: "+mathScore[i][k]);
			}
		}
		System.out.println();
		
		mathScore[0][0] = 32;
		mathScore[0][1] = 54;
		mathScore[0][2] = 64;
		mathScore[1][0] = 92;
		mathScore[1][1] = 84;
		mathScore[1][2] = 19;
		
		int totalStudent = 0;
		int totalMathSum = 0;
		for (int i=0; i<mathScore.length; i++) {
			totalStudent += mathScore[i].length;
			for (int k=0; k<mathScore[i].length; k++) {
				totalMathSum += mathScore[i][k];
			}
		}
		double totalMathAvg = (double)totalMathSum/totalStudent;
		System.out.println("수학 평균: "+totalMathAvg);
		System.out.println();
		
		
		int[][] englishScore = new int[2][];
		englishScore[0] = new int[2];
		englishScore[1] = new int[3];
		
		for (int i=0; i<englishScore.length;i++) {
			for (int k=0; k<englishScore[i].length; k++) {
				System.out.println("englishScore["+i+"]["+k+"]: "+englishScore[i][k]);
			}
		}
		System.out.println();
		
		englishScore[0][0] = 32;
		englishScore[0][1] = 54;
		englishScore[1][0] = 92;
		englishScore[1][1] = 84;
		englishScore[1][2] = 19;
		
		totalStudent = 0;
		int totalEnglishSum = 0;
		for (int i=0; i<englishScore.length; i++) {
			totalStudent += englishScore[i].length;
			for (int k=0; k<englishScore[i].length; k++) {
				totalEnglishSum += englishScore[i][k];
			}
		}
		double totalEnglishAvg = (double)totalEnglishSum/totalStudent;
		System.out.println("영어 평균: "+totalEnglishAvg);
		System.out.println();
		
	}

}
