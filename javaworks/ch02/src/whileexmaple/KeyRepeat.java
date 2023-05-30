package whileexmaple;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// 'y'키 - "계속 반복", 'n'키 - "반복 중단", 이외의 키 - "지원하지 않는 키 출력"
		// key == 'y'(비교 안됨), 문자열 비교 equals() 메서드 사용
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 반복할까요?(y/n) ");
			
			String key = sc.nextLine();	// String 형이므로 쌍따옴표를 사용
			
			if((key == "y") || key.equals("Y")) {
				System.out.println("계속 반복");
			}else if(key.equals("n")) {
				System.out.println("반복 중단");
				break;
			}else {
				System.out.println("지원하지 않는 키입니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}