package var;

public class FloatDoubleType {

	public static void main(String[] args) {
		/* 실수 자료형
		  실수 자료형 - float(4바이트), double(8바이트-표준)
		  소수점이하의 정밀도 차이
		  소수7자리 넘으면 float(끝에 'F', 'f'를 붙임)
		  오류 -> double 사용
		  double은 소수 16자리까지 출력됨
		 * */
		float fNum = 1.23456789F;
		double dNum = 1.2345678901234567;
		
		System.out.println(fNum);
		System.out.println(dNum);
	}

}
