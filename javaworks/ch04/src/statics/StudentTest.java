package statics;

public class StudentTest {

	public static void main(String[] args) {
		// 학생 객체 생성(lee - 힙 메모리영역 위치)
		Student lee = new Student();
		//다른 클래스에서 private이 붙은 변수는 접근할 수 없음
		//lee.studentId = 1001;  
		//lee.name = "이대한";
		
		lee.setStudentId(1001);
		lee.setName("이대한");
		
		System.out.println("학번: " + lee.getStudentId());
		System.out.println("이름: " + lee.getName());
	}

}
