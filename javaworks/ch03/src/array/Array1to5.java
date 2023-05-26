package array;

public class Array1to5 {

	public static void main(String[] args) {
		//배열에 1부터 10까지 저장
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++) {
			array[i] = i + 1;
		}
	}
}

//짝수 저장
	/*int[] array2 = new int[5];
	for(int i=0; i<array2.length; i++) {
		array2[i] = (i + 1) * 2;
	}
	
	for(int i=0; i<array2.length; i++) {
		System.out.print(array2[i] + " ");
	}*/