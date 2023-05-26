package chapter04;

public class Test4_2 {

	public static void main(String[] args) {
		//확인 3.
		while(true) {
			int dice1 = (int)(Math.random()*6) + 1;
			int dice2 = (int)(Math.random()*6) + 1;
			System.out.println(dice1 + "," + dice2);
			if(dice1 + dice2 == 5) break;  //(1, 4), (4, 1), (2, 3), (3, 2)
		}
		
		//확인 4.
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4 * x + 5 * y) == 60) { //4x+5y=60의 해 -> (5, 8), (10, 4)
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
		
		//확인 6
		//방법 1. 4행 4열
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) { //공백(" ")이 증가하고
				System.out.print(" "); 
			}
			for(int j=0; j<i+1; j++) { //별("*") 증가
				System.out.print("*");
			}
			System.out.println();
		}
		//방법 2. 4행 4열
		for(int i=0; i<4; i++) {
			for(int j=3; j>=0; j--) {
				if(i < j) {
					System.out.print(" ");
				}
				else {  //i >= j
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
