package arraylist;

public class Student {
	int studentId;       //학번
	String studentName;  //이름
	Subject korean;      //국어 과목
	Subject math;        //수학 과목
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		korean = new Subject();  //과목 객체 생성
		math = new Subject();
	}
	
	//국어 성적 입력 메서드
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	//수학 성적 입력 메서드
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	//학생 정보
	public void showInfo() {
		System.out.printf("학생 %s의 국어 성적은 %d점이고, 수학 성적은 %d점입니다.\n", 
				studentName, korean.getScorePoint(), math.getScorePoint());
	}
}
