package objectarray;

public class Book {
	
	String bookName;
	String author;
	
	//생성자 오버로딩 - 이름은 같은데 매개변수의 자료형이 다른 것
	public Book(){}   //기본 생성자
	
	//매개변수가 있는 생성자
	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	public void bookInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	//책 이름을 입력하는 메서드
	void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	//책 이름을 가져오드 메서드
	String getBookName() {
		return bookName;
	}
	
	//저자를 입력하는 메서드
	void setAuthor(String author) {
		this.author = author;
	}
	
	//저자를 가져오는 메서드
	String getAuthor() {
		return author;
	}
}
