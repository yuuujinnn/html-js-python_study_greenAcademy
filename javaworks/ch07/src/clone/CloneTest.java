package clone;

public class CloneTest {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 = new int[4];
		int[] arr3 = new int[4];
		
		//arr1을 arr2에 복사
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		//arr1을 arr3에 복사
		arr3 = arr1.clone();
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}
