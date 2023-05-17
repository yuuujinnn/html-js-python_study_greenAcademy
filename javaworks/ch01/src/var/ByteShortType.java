package var;

public class ByteShortType {

	public static void main(String[] args) {
		// Byte형(-128 ~ 127) - 8비트, 256
		// short형(-32768 ~ 32767) - 16비트, 65536 -> 유니코드
		byte bData1 = -128;
		//byte bData2 = 128; //127을 넘어서 오류(오버플로우:over flow)
		
		short sData1 = 128;
		short sData2 = 32767;
		
		System.out.println(bData1);
		System.out.println(sData1);
		System.out.println(sData2);

	}

}
