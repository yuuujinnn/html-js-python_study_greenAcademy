package twodimention;

public class TwoDimention2 {

	public static void main(String[] args) {
		// 5행 5열의 2차원 배열 생성 - 문자 입력
		char[][] a = new char[5][5];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = '*';	// 별 문자 저장
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		// 삼각형 모양 만들기
		/*
		 *
		 **
		 ***
		 ****
		 *****
		*/
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<i+1; j++) {
				a[i][j] = '*';	// 별 문자 저장
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		/*
		 *****
		 ****
		 ***
		 **
		 *
		 */
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a[i].length; j++) {
				a[i][j] = '*';	// 별 문자 저장
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		/*
		 	i=0 j=0 a[0][0] *
		 			a[0][1] **
		 			a[0][2] ***
		 			a[0][3] ****
		 			a[0][4] *****(최종)
		 	i=1 j=1 a[1][1] *
		 			a[1][2] **
		 			a[1][3] ***
		 			a[1][4] ****(최종)
		 	i=2 j=2 a[2][2] *
		 			a[2][3] **
		 			a[2][4] ***(최종)
		 */
		
		/*
		 1 2 3 4 5
		 6 7 8 9 10
		 11 12 13 14 15
		 16 17 18 19 20
		 21 22 23 24 25
		 */
		// 1부터 순차 증가
		int[][] arr = new int[4][5];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				// 열의 종료값 x 행의 값 + 열의 값
				arr[i][j] = (arr[i].length*i)+(j+1);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}