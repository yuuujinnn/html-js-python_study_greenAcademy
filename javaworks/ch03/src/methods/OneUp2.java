package methods;

public class OneUp2 {
	//정적변수는 프로그램이 종료될때 소멸하고, 값을 계속 유지(공유)
	static int x = 0;  //static이 붙은 x는 정적 변수
	
	//static() 함수
	public static int oneUp() {
		x = x + 1;
		return x;
	}

	public static void main(String[] args) {
		
		System.out.println(oneUp());  //1
		System.out.println(oneUp());  //2
		System.out.println(oneUp());  //3
		
		//x값 확인
		System.out.println("x = " + x);
	}

}
