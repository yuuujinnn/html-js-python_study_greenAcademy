package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		// Student 클래스 사용
		//std1 - 객체, 객체변수, 인스턴스, 오브젝트
		Student std1 = new Student(101, "김산");
		std1.showInfo();
		
		Student std2 = new Student(102, "이강");
		std2.showInfo();
	}
}
