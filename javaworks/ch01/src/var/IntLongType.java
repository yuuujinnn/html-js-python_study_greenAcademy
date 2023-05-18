package var;

public class IntLongType {

	public static void main(String[] args) {
		// int - 4byte : 32bit(-21억 ~ 21억)
		int iNum = 1234567890; //21억 초과하면 에러 발생
		
		//long 자료형(8byte-64bit)은 int와 구분하기 위해 끝에 'L', 'l'을 붙임
		long lNum = 12345678900L;  //120억 가능
		
		System.out.println("int형 :" + iNum);
		System.out.println("long형 : " + lNum);

	}

}
