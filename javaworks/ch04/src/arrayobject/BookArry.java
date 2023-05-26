package arrayobject;

public class BookArry {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		for(int i=0; i<library.length; i++) {
			System.out.print(library[i] + " ");
		}
		System.out.println();
		
		library[0] = new Book("혼자 공부하는 Java", "신용권");
		library[1] = new Book("반응형 웹 프로젝트", "김은아");
		library[2] = new Book("tiny project", "켄 유엔스-클락");
		library[3] = new Book("미생1", "윤태호");
		library[4] = new Book("미생2", "윤태호");
		
		for(int i=0; i<library.length; i++) {
			library[i].showInfo();
		}
		
		for(Book book : library)
			System.out.println(book);
	}

}
