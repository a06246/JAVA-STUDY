package ch05.sec05;

public class IndexOfContainsEx {

	public static void main(String[] args) {
		String name = "java program";
		
		int location = name.indexOf("program");
		System.out.println(location);
		String subString = name.substring(location);
		System.out.println(subString);
		
		location = name.indexOf("java");
		if (location == -1) {
			System.out.println("자바와 관련없다.");
		} else {
			System.out.println("자바와 관련있다.");
		}
		
		boolean result = name.contains("java");
		if (result) {
			System.out.println("자바와 관련있다.");
		} else {
			System.out.println("자바와 관련없다.");
		}
	}

}
