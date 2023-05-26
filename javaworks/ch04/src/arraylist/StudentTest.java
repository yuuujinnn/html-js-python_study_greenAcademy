package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(1001, "이양파");
		
		s1.koreanSubject("국어", 90);
		s1.mathSubject("수학", 80);
		s1.showInfo();
		
	}
}
