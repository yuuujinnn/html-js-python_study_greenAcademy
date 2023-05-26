package methods;

public class ArrayParam {
	
	public static void main(String[] args) {
		// 더하기 기능 함수 호출
		//ArrayParam ap = new ArrayParam();  //ap(객체) - 힙 메모리 공간
		int val = add(4, 5); 
		System.out.println(val);
		
		//배열 생성한 후 add() 호출
		int[] num = {1, 2, 3, 4};
		System.out.println("합계: " + add(num));
		
		//add2() 호출
		int[] result = add2(num);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	//매개로 받은 배열을 2의 배수로 저장한후 반환하는 함수
	public static int[] add2(int[] value) {
		int[] value2 = new int[4];
		for(int i=0; i<value.length; i++) {
			value2[i] = value[i] * 2;
		}
		return value2;
	}
	
	//더하기 기능이 있는 함수 - 매개변수로 변수 활용
	// static을 붙이는 이유-new로 객체를 생성하지 않음) - 정적 메모리 영역
	public static int add(int x, int y) {
		return x + y;
	}
	
	//매개변수로 배열을 사용
	public static int add(int[] value) {
		int sum = 0;
		for(int i=0; i<value.length; i++) {
			sum += value[i];
		}
		return sum;
	}
	
	
}
