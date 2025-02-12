package ch03.sec09;

public class BitShiftEx2 {

	public static void main(String[] args) {
		int value = 772;
		
		// 오른쪽으로 3byte(24bit) 이동하고 끝 1byte만 읽음
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;
		System.out.println("1번째 바이트 부호 없는 값: "+ int1);
		
		// 오른쪽으로 2byte(16bit) 이동하고 끝 1byte만 읽음
		byte byte2 = (byte) (value >>> 16);
		int int2 = byte2 & 255;
		System.out.println("2번째 바이트 부호 없는 값: "+ int2);
				
		// 오른쪽으로 1byte(8bit) 이동하고 끝 1byte만 읽음
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255;
		System.out.println("3번째 바이트 부호 없는 값: "+ int3);
		
		// 끝 1byte만 읽음
		byte byte4 = (byte) value;
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.println("4번째 바이트 부호 없는 값: "+ int4);
		
	}

}
