package input;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		// 입력 처리 - Scanner
		// java.util.Scanner 클래스를 import하여 사용함
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? ");
		String name = scan.nextLine();  //콘솔창에 이름 입력
		System.out.println("당신의 이름은 " + name + "이군요!");
		
		System.out.print("당신의 나이는 몇 세입니까? ");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 " + age + "세 이군요!");
		
		scan.close();  //닫기
	}
}
