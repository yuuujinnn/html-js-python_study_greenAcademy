package arrayobject;

public class Book {
	String bookName;
	String author;
	
	public Book() {}  //기본 생성자 명시함
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
}
