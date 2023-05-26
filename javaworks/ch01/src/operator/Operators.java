package operator;

public class Operators {

	public static void main(String[] args) {
		int num = 10;
		int val = 0;
		
		val = num++;    //후치 연산 val = num 이후 num = num + 1
		//val = ++num;  //num = num + 1 이후 val = num
		System.out.println(val);
		System.out.println(num);
		
		int num1 = 0b00000000000000000000000000000101;
		int num2 = 0b11111111111111111111111111111011;
		
		int sum = num1 + num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
		
	}

}
