package nestedfor;

public class NestedFor {

	public static void main(String[] args) {
		//방법 1.
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//방법 2.
		for(int i=0; i<5; i++) {
			for(int j=4; j>=0; j--) {
				if(i < j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
