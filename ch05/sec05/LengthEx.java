package ch05.sec05;

public class LengthEx {

	public static void main(String[] args) {
		String ssn = "12345678917234";
		int length = ssn.length();
		
		if (length == 13) {
			System.out.println("주민번호가 맞습니다.");
		} else {
			System.out.println("주민번호가 틀립니다.");
		}

	}

}
