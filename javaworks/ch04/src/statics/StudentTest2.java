package statics;

public class StudentTest2 {

	public static void main(String[] args) {
		// 학번 자동 부여
		Student Kim = new Student();
		Student Han = new Student();
		Student Kang = new Student();
		
		System.out.println("학번 : " + Kim.getStudentId());
		System.out.println("학번 : " + Han.getStudentId());
		System.out.println("학번 : " + Kang.getStudentId());

	}

}
