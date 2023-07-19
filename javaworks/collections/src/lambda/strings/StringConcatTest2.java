package lambda.strings;

public class StringConcatTest2 {
	
	public static void main(String[] args) {
		
		StringConcat concat;
		
		//람다식
		concat = (s, v) -> System.out.println(s + ", " + v);
		
		concat.makeString("green", "computer");
	}
}
