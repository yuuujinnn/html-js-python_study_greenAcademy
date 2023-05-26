package arrayobject;

public class DeepCopy {

	public static void main(String[] args) {
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("혼자 공부하는 Java", "신용권");
		array1[1] = new Book("반응형 웹 프로젝트", "김은아");
		array1[2] = new Book("Tiny Python project", "켄 유엔스-클락"); 
		
		//기본 생성자로 array2 배열 인스턴스 생성
		array2[0] = new Book();
		array2[1] = new Book();
		array2[2] = new Book();
		
		//get(), set() 메서드로 배열 복사
		for(int i=0; i<array1.length; i++) {
			array2[i].setBookName(array1[i].getBookName());
			array2[i].setAuthor(array2[i].getAuthor());
		}
		
		//array1의 0번째 요소값 수정
		array1[0].setBookName("미생1");
		array1[1].setAuthor("윤태호");
		
		for(int i=0; i<array1.length; i++) {
			array1[i].showInfo();
		}
		
		for(Book book : array2)
			book.showInfo();
	}
}
