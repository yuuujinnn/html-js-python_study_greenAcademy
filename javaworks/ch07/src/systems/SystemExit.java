package systems;

public class SystemExit {
	public static void main(String[] args) {
		
		//system.exit(0) - 0은 정상 종료를 의미
		for (int i=1; i<=10; i++) {
			if (i == 5)
				//break; //for문을 빠져나옴
				System.exit(0); //main() 함수에서 빠져나옴
			System.out.println(i);
		}
		System.out.println("반복 종료");
	}
}
