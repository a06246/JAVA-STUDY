package ch05.sec09;

public class ArrayCopyEx {

	public static void main(String[] args) {
		String[] oldStrArray = { "what","the","fuck" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for (int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+", ");
		}
	}

}
