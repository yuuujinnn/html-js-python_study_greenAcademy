package whileexmaple;

public class Integer1 {

	public static void main(String[] args) {
	      System.out.println("10" + "11");
	      System.out.println(10 + 11);
	      
	      //문자형을 숫자로 변환
	      int value1 = Integer.parseInt("10");
	      System.out.println(value1);
	      
	      int value2 = Integer.parseInt("11");
	      System.out.println(value2);
	      
	       System.out.println(value1 + value2);
	       System.out.println(value1 > value2);
	       
	       double dval = Double.parseDouble("2.54");
	       System.out.println(dval);
	}
}