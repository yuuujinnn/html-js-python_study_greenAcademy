package ifexample;

public class IfOperator {

	public static void main(String[] args) {
		// 두 수의 사칙 연산 프로그램 - if문
		int num1 = 10;
		int num2 = 2;
		char operator = '*';
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		}else if(operator == '-') {
			result = num1 - num2;
		}else if(operator == '*') {
			result = num1 * num2;
		}else if(operator == '/') {
			result = num1 / num2;
		}else {
			System.out.println("연산자 오류입니다.");
		}
		System.out.println("결과는 " + result + "입니다.");
	}

}
