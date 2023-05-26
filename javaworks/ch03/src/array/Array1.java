package array;

public class Array1 {

	public static void main(String[] args) {
		int[] arr = new int[4];
		int sumV = 0;
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		// 값 수정
		arr[1] = 5;
		
		System.out.println(arr);
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//합계
		for(int i=0; i<arr.length; i++) {
			sumV += arr[i];
			System.out.println(arr[i]);
		}
		System.out.println(sumV);
		
		
		//향상된 for
		for(int i : arr)
			System.out.println(i);
		
		
		
	}

}
