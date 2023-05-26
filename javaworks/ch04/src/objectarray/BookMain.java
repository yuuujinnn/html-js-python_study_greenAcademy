package objectarray;

public class BookMain {

	public static void main(String[] args) {
		//Book 객체 생성 - 책 5권
		Book[] library = new Book[5];
		
		//System.out.println(library[0]);
		//배열의 자료가 없는 경우 - null
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		//자료 저장
		library[0] = new Book("반응형 웹사이트", "김은아");
		library[1] = new Book("Tiny Python Project", "켄 유엔스-클락");
		library[2] = new Book("혼자 공부하는 자바", "신용권");
//		library[3] = new Book("미생1", "윤태호");
//		library[4] = new Book("미생2", "윤태호");
		
//		for(int i=0; i<library.length; i++) {
//			//배열의 저장되지 않은 공간이 있을때 반드시 명시
//			if(library[i] != null) { 
//				library[i].bookInfo();
//			}
//		}
		
		//향상된 for
		for(Book book : library) {
			//book 객체가 null이 아니면 출력
			if(book != null) {
				book.bookInfo();
			}
		}
	}

}
