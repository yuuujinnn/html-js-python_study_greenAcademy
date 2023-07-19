package lambda;

public class MyNumberTest {
	
	public static void main(String[] args) {
		
		//변수 선언
		MyNumber num;
		
		//람다식 - return 생략 가능
//		num = (x, y) -> {
//			return (x >= y) ? x : y;
//		};
		
		num = (x, y) -> (x >= y) ? x : y;
		
		int result = num.getMax(11, 10);
		System.out.println(result);
	}
}
