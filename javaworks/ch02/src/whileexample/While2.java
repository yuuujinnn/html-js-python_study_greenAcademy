package whileexample;

public class While2 {

	public static void main(String[] args) {
		// while문 - 반복조건문(if~ break)
		int i = 0;
		int sumVal = 0;
		
		while(true) {
			i++;
			if(i > 10) {  //i=11일때 break 실행됨
				break;
			}
			sumVal += i;
			System.out.println(i);
		}
		System.out.println("합계: " + sumVal);
	}

}
