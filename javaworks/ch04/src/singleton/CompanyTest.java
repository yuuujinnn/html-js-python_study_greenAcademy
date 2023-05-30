package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		
		// 주소가 같은지 비교
		System.out.println(com1 == com2);
		
		System.out.println(com1);
		System.out.println(com2);

	}

}
