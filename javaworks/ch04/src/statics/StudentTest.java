package statics;

public class StudentTest {

	public static void main(String[] args) {
		// 학생 객체 생성(Lee - 힘 메모리영역 위치)
		Student Lee = new Student();
		// 다른 클래스에서 private이 붙은 변수는 접근할 수 없음
		// Lee.studentId = 1001;
		// Lee.name = "이한범";
		
		Lee.setStudentId(1001);
		Lee.setName("이한범");
		
		System.out.println("학번: " + Lee.getStudentId());
		System.out.println("이름: " + Lee.getName());

	}

}
