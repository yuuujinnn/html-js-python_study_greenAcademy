package lambda;

public class MyFunctionalInterfaceTest {

	public static void main(String[] args) {
		//인터페이스형 객체(변수) 선언
		MyFunctionalInterface fi;
		
		//람다식으로 구현(익명함수) : (매개변수) -> {}
		//블럭이 한줄일 경우는 중괄호({}) 생략 가능
		/*
		 * fi = () -> { System.out.println("Hello~ Java"); };
		 */
		fi = () -> System.out.println("Hello~ JAva");
		
		fi.method();
	}
}
