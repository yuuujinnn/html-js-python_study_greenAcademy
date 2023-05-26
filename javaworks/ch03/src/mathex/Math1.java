package mathex;

public class Math1 {

	public static void main(String[] args) {
		
		System.out.println(Math.abs(-10));
		System.out.println(Math.round(5.6));
		System.out.println(Math.floor(5.93));
		
		double rnd = Math.random();
		System.out.println(rnd);
		
		int dice = (int)(Math.random() * 6 + 1);
		System.out.println(dice);
		
		String[] word = {"나", "너", "우리", "세계"};
		int num = (int)(Math.random() * word.length);
		System.out.println(num);
		
		System.out.println(word[num]);
	}

}
