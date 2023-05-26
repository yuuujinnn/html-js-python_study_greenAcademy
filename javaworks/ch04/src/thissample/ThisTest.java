package thissample;

public class ThisTest {

	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2023);
		
		//객체 주소 비교 (같음)
		System.out.println(bDay); //bDay 주소 출력
		bDay.printThis();
		
	}

}
