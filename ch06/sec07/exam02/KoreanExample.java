package ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("kim", "23489982-9238902");
		System.out.println("k1.nation: "+k1.nation);
		System.out.println("k1.name: "+k1.name);
		System.out.println("k1.ssn: "+k1.ssn);
		
		Korean k2 = new Korean("Lee", "23482132-123212");
		System.out.println("k2.nation: "+k2.nation);
		System.out.println("k2.name: "+k2.name);
		System.out.println("k2.ssn: "+k2.ssn);
		
		
	}

}
