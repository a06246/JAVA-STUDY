package ch05.sec04;

public class GarbageObjectEx {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null;
		
		String kind1 = "car";
		String kind2 = kind1; //  kind2는 kind1의 객체에 접근함 
		kind1 = null;
		System.out.println("kind2: "+kind2);
		

	}

}
