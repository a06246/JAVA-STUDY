package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 1;
		}
		// int v3 = v1 + v2;
		// error : v2를 사용할 수 없음 
	}

}
