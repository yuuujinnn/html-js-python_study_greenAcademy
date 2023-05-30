package twodimention;

public class TwoDimention1 {

	public static void main(String[] args) {
		// 정수형 2차원 배열(크기 - 2행 3열)
		int[][] a = new int[2][3];
		
		System.out.println("배열의 크기: " + a.length); // 행의 크기
		System.out.println("배열의 크기: " + a[0].length);	 // 열의 크기
		System.out.println("배열의 크기: " + a[1].length);	 // 열의 크기
		
		// 전체 출력(중첩 for)
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		/* 데이터 저장
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6; */
		
		// 데이터 저장2
		int[][] a2 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		// 출력
		for(int i=0; i<a2.length; i++) {
			for(int j=0; j<a2[i].length; j++) {
				System.out.print(a2[i][j] + " ");
			}
			System.out.println();
		}
	}
}