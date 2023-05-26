package classpart;

public class PointTest {

	public static void main(String[] args) {
		// Point 클래스의 객체 생성
		Point point1 = new Point(3, 4);
		Point point2 = new Point(10, 15);
		
		//point.x = 3; //직접 멤버변수에 접근 방식은 좋지 않음
		//point.y = 4;
		
		System.out.println("점(" + point1.x + ", " + point1.y + ")");
		System.out.println("점(" + point2.x + ", " + point2.y + ")");

	}

}
