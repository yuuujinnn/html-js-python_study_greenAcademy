package forexample;

public class GugudanTest {

	public static void main(String[] args) {
		// 단보다 곱하는 수가 작거나 같은 경우까지만 출력
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}
}
