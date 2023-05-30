package classpart;

// 접근 제어자 - public
public class Student {
	// 클래스의 3요소 - 멤버 변수, 생성자, 메서드
	// 생성자(Constructor)는 반환형이 없고 클래스 이름과 동일
	// 생성자 오버로딩(이름은 같고 자료형과 변수 이름이 다른 것을 말함)
	int studentID;		// 학번
	String studentName;	// 이름
	
	public Student() {}	// 기본 생성자
	
	// 매개 변수가 있는 생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	// void(비어있는, 자료형이 없는) 형(return 키워드 없을 때)
	public void showInfo() {
		System.out.println("학번: " + studentID + ", 이름: " + studentName);
	}
}
