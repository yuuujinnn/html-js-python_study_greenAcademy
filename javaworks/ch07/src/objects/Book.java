package objects;

public class Book {
	
	//필드
	int bookNumber;
	String bookTitle;
	
	//생성자
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	
	//toString() 재정의
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}
	
	
	//hashCode() 재정의
	@Override
	public int hashCode() {
		return bookNumber;  //해시코드 반환값과 같은 의미
	}

	
	//equals() 재정의
	@Override
	public boolean equals(Object obj) {
		//강제 형변환
		if(obj instanceof Book) {	//obj의 Book의 인스턴스(객체)라면
			Book book = (Book)obj;  //강제 형변환
			if(this.bookNumber == book.bookNumber) 
				return true;  //true 반환
		}
		return false;
	}
	
	
	
}
