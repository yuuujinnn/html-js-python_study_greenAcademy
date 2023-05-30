package types;

public class TypeConversion {

	public static void main(String[] args) {
		// 형 변환
		// 묵시적 형 변환(자동 형 변환)
		int iNum = 20;
		float fNum = iNum;
		
		System.out.println(iNum);	// 20
		System.out.println(fNum);	// 20.0
		
		double dNum;
		dNum = iNum + fNum;
		
		System.out.println(dNum);	// 40.0
				
		// 명시적 형 변환(강제 형 변환)
		double dNum1 = 1.2;
		float fNum2 = 0.9F;		// 값의 끝에 'F' or 'f'를 붙임
		
		int iNum2 = (int)dNum1 + (int)fNum2;	// 1 + 0 -> 1
		int iNum3 = (int)(dNum1 + fNum2);		// (1.2+0.9=2.1) -> 2	
				
		System.out.println(iNum2);
		System.out.println(iNum3);

	}

}
