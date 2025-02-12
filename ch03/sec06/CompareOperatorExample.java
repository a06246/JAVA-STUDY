package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 10;
		boolean res1 = (n1 == n2);
		boolean res2 = (n1 != n2);
		boolean res3 = (n1 < n2);
		System.out.println("result1: "+res1); //t
		System.out.println("result2: "+res2); //f
		System.out.println("result3: "+res3); //f
		
		char char1 = 'A';
		char char2 = 'B';
		boolean res4 = (char1 < char2);
		System.out.println("result4: "+res4); //t
		
		int n3 = 1;
		double n4 = 1.0;
		boolean res5 = (n3 == n4);
		System.out.println("result5: "+res5); //t
		
		float n5 = 0.1f;
		double n6 = 0.1;
		boolean res6 = (n5 == n6); // 정밀도 차이 때문
		boolean res7 = (n5 == (float)n6);
		System.out.println("result6: "+res6); //f
		System.out.println("result7: "+res7); //t
		
		String str1 = "자바";
		String str2 = "JAVA";
		boolean res8 = (str1.equals(str2));
		boolean res9 = (!str1.equals(str2));
		System.out.println("result8: "+res8); //f
		System.out.println("result9: "+res9); //t

	}

}
