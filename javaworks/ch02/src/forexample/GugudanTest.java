package forexample;

public class GugudanTest {

	public static void main(String[] args) {
		// 구구단
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}

}
