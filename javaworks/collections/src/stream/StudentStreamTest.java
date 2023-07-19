package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStreamTest {
	
	public static void main(String[] args) {
		//Arrays를 사용 - 학생 3명 생성
		List<Student> list = Arrays.asList(
			new Student("콩쥐", 90),
			new Student("팥쥐", 70),
			new Student("흥부", 80)
		);

		//전체 조회(for)
		for (Student std : list)
			System.out.println(std.getName() + ", " + std.getScore());
		System.out.println("==============================");
		
		//stream과 람다식으로 출력
		Stream<Student> stream = list.stream();
//		stream.forEach(student -> {
//			String name = student.getName();
//			int score = student.getScore();
//			System.out.println(name + ", " + score);
//		});
		
		stream.forEach(student ->
			System.out.println(student.getName() + ", " + student.getScore())
		);
		
	}
}
