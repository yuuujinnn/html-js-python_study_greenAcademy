package thissample;

public class Birthday {
	int year;
	int month;
	int day;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	//this 객체의 주소를 출력할 함수
	public void printThis() {
		System.out.println(this);
	}
}
