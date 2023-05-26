package dimention2;

public class TwoDimention {

	public static void main(String[] args) {
		// 2차원 배열
		int[][] a = new int[2][3];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(a.length);
		System.out.println(a[1].length);
		
		//입력
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("=== 아파트 세대 구현 ===");
		//5행 3열의 2차원 배열
		//전층 3세대, 3층만 2세대
		int[][] household = new int[5][3];
		household[2] = new int[1];
		
		System.out.printf("5층 %d세대\n", household[4].length);
		System.out.printf("4층 %d세대\n", household[3].length);
		System.out.printf("3층 %d세대\n", household[2].length);
		System.out.printf("2층 %d세대\n", household[1].length);
		System.out.printf("1층 %d세대\n", household[0].length);
	}

}
