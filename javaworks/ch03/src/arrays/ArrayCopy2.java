package arrays;

public class ArrayCopy2 {

	public static void main(String[] args) {
		//char형 1차원 배열 arr1에 N, E, T 저장
		char[] arr1 = {'N', 'E', 'T'};
		char[] arr2 = new char[3];
		char[] arr3 = new char[3];
		
		//배열 복사(arr1 -> arr2)
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];  //arr1을 arr2에 복사함
			System.out.print(arr2[i] + " ");
		}
		System.out.println();  //줄바꿈
		
		//역순 복사(arr1 -> arr3) N E T -> T E N
		for(int i=0; i<arr1.length; i++) {
			arr3[2-i] = arr1[i];  //arr1을 arr3에 복사함
			System.out.print(arr3[i] + " ");
		}
		/*
		 * i=0 arr3[2]=arr1[0]       N   출력 arr3[0]='' (출력안됨)
		 *     arr3[1]=arr1[1]    E  T   출력 arr3[1]=E
		 *     arr3[0]=arr1[2] T  E  N   출력 arr3[2]=T
		 *     
		 */
		System.out.println();
		//arr3 출력
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");  //arr1을 arr2에 복사함
		}
	}

}
