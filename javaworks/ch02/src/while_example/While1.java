package while_example;

public class While1 {

	public static void main(String[] args) {
		System.out.println("=== 1부터 10까지 출력 === ");
		int i = 0;
		while(true) {
			i++;
			if (i > 10)
				break;
			System.out.println(i);
		}
		
		System.out.println("=== 1부터 10까지 더하기 ===");
		int n = 0;
		int sumV = 0;
		while(true) {
			n++;
			if (n > 10)
				break;
			sumV += n;
		}
		System.out.println("합계 :" + sumV);
	}

}
