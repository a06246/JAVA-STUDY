package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		String ssn = "0306244234567";
		char sex = ssn.charAt(6);
		
		switch(sex) {
		case '1':
		case '3':
			System.out.println("man");
			break;
		case '2':
		case '4':
			System.out.println("woman");
			break;
		}

	}

}
