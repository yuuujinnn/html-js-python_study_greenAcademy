package dimention2;

public class TwoDimention2 {

	public static void main(String[] args) {
		//star print
		char[][] a = new char[5][5];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]= '*';
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<i+1; j++) {
				a[i][j]= '*';
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a[i].length; j++) {
				a[i][j]= '*';
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		//1부터 순차 증가
		int[][] arr = new int[5][5];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=(arr[i].length*i)+j+1;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		/*for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}*/
	}

}
