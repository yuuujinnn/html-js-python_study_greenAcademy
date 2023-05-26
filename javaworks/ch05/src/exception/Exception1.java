package exception;

public class Exception1 {

	public static void main(String[] args) {
		// 1. NullPointerException 발생 - 실행 예외(런타임 예외)
		String data = null;
		// toString() - data의 정보를 문자열로 출력하는 매세드
		//data.toString();
		
		//2. NumberFormatException - 숫자 형식이 아닐때 발생 예외
		String data2 = "a200";
		
		int value = Integer.parseInt(data2);
		System.out.println(value);

	}

}
