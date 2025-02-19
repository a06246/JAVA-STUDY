package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("238-1299", "kim");
		
		System.out.println(k1.nation);	// 변경 불가 
		System.out.println(k1.ssn);		// 변경 불가
		System.out.println(k1.name);	// 변경 가능 
		
	}

}
