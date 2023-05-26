package arraylist.studentlist;

public class StudentArrayList {

	public static void main(String[] args) {
		// 학생 객체 생성
		Student s1 = new Student(1001, "이양파");
		
		s1.addSubject("국어", 90);
		s1.addSubject("수학", 80);
		s1.addSubject("과학", 75);
		
		s1.showInfo();

	}

}
