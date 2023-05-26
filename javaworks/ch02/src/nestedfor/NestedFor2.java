package nestedfor;

public class NestedFor2 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//방법1.
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//방법2.
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
				if(j == i) {
					System.out.println();
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=1; j<=4; j++) {
				int num = 4*i+j;
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
