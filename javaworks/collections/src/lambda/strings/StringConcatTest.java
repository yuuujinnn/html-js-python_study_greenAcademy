package lambda.strings;

public class StringConcatTest {
	public static void main(String[] args) {
		String s1 = "green";
		String s2 = "computer";
		
		StringConcatImpl concat = new StringConcatImpl();
		concat.makeString(s1, s2);
		
	}
}
