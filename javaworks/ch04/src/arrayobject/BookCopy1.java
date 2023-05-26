package arrayobject;

public class BookCopy1 {

	public static void main(String[] args) {
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("혼자 공부하는 Java", "신용권");
		array1[1] = new Book("반응형 웹 프로젝트", "김은아");
		array1[2] = new Book("Tiny Python project", "켄 유엔스-클락"); 
		
		//배열 복사
		System.arraycopy(array1, 0, array2, 0, 3);
		
		for(Book book : array2)
			book.showInfo();
	}
}
