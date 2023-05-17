package var;

public class Calc {

	public static void main(String[] args) {
		//두 수의 합, 차, 곱, 나누기
		int x = 10, y = 20;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		//정수 연산 : 결과 -정수 -> 실수 연산(자료형을 실수로 바꿔야함)
		//double형으로 형 변환
		System.out.println(x / (double)y);  
	}

}
