package ch05.sec05;

public class SplitEx {

	public static void main(String[] args) {
		String board = "1,java,string.,hong";
		
		String[] tokens = board.split(",");
		
		System.out.println("번호: "+tokens[0]);
		System.out.println("제목: "+tokens[1]);
		System.out.println("내용: "+tokens[2]);
		System.out.println("이름: "+tokens[3]);
		System.out.println();
		
		for (int i=0; i<tokens.length ; i++) {
			System.out.println(tokens[i]);
		}
		
	}

}
