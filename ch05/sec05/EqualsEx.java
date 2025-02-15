package ch05.sec05;

public class EqualsEx {

	public static void main(String[] args) {
		String strVar1 = "hong";
		String strVar2 = "hong";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1 and strVar2는 참조가 같다");
		} else {
			System.out.println("strVar1 and strVar2는 참조가 다르다");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1 and strVar2는 문자열이 같다");
		}
		
		String strVar3 = new String("hong");
		String strVar4 = new String("hong");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3 and strVar4는 참조가 같다");
		} else {
			System.out.println("strVar3 and strVar4는 참조가 다르다");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3 and strVar4는 문자열이 같다");
		}

	}

}
