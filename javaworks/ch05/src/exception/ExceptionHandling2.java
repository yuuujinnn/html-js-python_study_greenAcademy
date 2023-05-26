package exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// 명령행 실행
		// Run - Run Configurations - Arguments 
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			
			System.out.println(data1 + ", " + data2);
		}catch(Exception e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			//System.out.println(e);
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(Exception e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행해 주세요");
		}
	}

}
