package array;

public class Array2 {

	public static void main(String[] args) {
		// 배열 복사
		char[] arr1 = {'N', 'E', 'T'};
		char[] arr2 = new char[3];
		char[] arr3 = new char[3];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		for(int i=0; i<arr1.length; i++) {
			arr3[2-i] = arr1[i];
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr3[i] + " ");
		}

	}

}
