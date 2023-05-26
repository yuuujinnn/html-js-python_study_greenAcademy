package array;

public class Array3 {

	public static void main(String[] args) {
		 int list_size = 5; // 배열 사이즈
		 int[] list = new int[list_size]; // 배열의 크기가 5인 배열을 생성
		 int count = 0; // 배열 원소가 이동할 때 마다 count
		 
		 for(int j = 0; j < list.length; j++) { 
		  list[j] = j+1; // 인덱스가 i일 때 배열 값은 i+1을 넣는다.
		 }
		 
		 for(int j = 0; j < list.length; j++) { 
			 System.out.print(list[j] + " ");
		 }
		 
		 System.out.println();
		 
		 for(int i = list.length-1; i > 1; i--) { // 배열의 마지막 인덱스부터 우리가 바꾸고 싶은 인덱스 전까지 반복문을 돌린다.
			  list[i] = list[i-1];  // 인덱스i-1의 값을 인덱스 i로 이동
			  count++;  // 이동할 때마다 count 증가
			 }
		 list[1] = 5; // 이동이 끝난 다음 원하는 값을 넣는다.
		 for(int j = 0; j < list.length; j++) { 
			 System.out.print(list[j] + " ");
		 }
		 System.out.println();
		 System.out.println(count); // counting을 확인한다.
		 System.out.println(list[1]);
		
	}

}
