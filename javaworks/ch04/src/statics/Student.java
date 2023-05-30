package statics;

public class Student {
	private static int serialNum = 1000;	// 기준 번호
	private int studentId;	// 학번
	private String name;	// 이름
	
	Student(){ //기본 생성자
		serialNum++;			// serialNum을 1 증가
		studentId = serialNum;  // 증가된 번호를 학번에 
	}
	
	// get(), set()
	int getStudentId() {
		return studentId;
	}
	
	void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	String getName() {
		return name;
		
	}
	
	void setName(String name) {
		this.name = name;
	}

}