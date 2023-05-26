package input;

import java.util.Scanner;

public class KmToMile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final Double RATE_KPH_MPH = 1.609344;
		double kph = 0.0;
		double mph = 0.0;
		
		System.out.print("당신의 구속을 입력하세요(km/h): ");
		kph = sc.nextDouble();
		
		mph = kph / RATE_KPH_MPH;
		
		//System.out.println("당신의 구속은 " + mph + "이군요!");
		System.out.printf("당신의 구속은 %.2f[MPH] 이군요!", mph);
		sc.close();
	}

}
