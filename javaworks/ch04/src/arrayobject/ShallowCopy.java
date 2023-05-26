package arrayobject;

public class ShallowCopy {

	public static void main(String[] args) {
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("혼자 공부하는 Java", "신용권");
		array1[1] = new Book("반응형 웹 프로젝트", "김은아");
		array1[2] = new Book("Tiny Python project", "켄 유엔스-클락"); 
		
		//array1의 0번째 요소값 수정
		array1[0].setBookName("미생1");
		array1[1].setAuthor("윤태호");
		
		//배열 복사
		System.arraycopy(array1, 0, array2, 0, 3);
		
		for(int i=0; i<array1.length; i++) {
			array1[i].showInfo();
		}
		
		for(Book book : array2)
			book.showInfo();
	}
}
