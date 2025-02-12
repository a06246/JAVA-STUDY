package ch03.sec09;

public class BitShiftEx {

	public static void main(String[] args) {
		int n1 = 1;
		int res1 = n1 << 3;
		int res2 = n1 * (int) Math.pow(2, 3); // 2^3
		System.out.println("res1: "+res1);
		System.out.println("res2: "+res2);
		
		int n2 = -8;
		int res3 = n2 >> 3;
		int res4 = n2 / (int) Math.pow(2, 3); // 2^3
		System.out.println("res3: "+res3);
		System.out.println("res4: "+res4);

	}

}
