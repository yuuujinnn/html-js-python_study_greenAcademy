package classpart;

//원은 점 클래스(자료형)를 참조하고 있음
public class Circle {
	Point center;  //Point 클래스를 멤버변수로 사용
	int radius;
	
	//생성자(public, private이 없는 경우 default라고 함)
	//default는 다른 패키지에 사용 못함, 같은 패키지 내부에서 사용 가능
	//public은 외부 클래스 어디에서나 사용 가능함d
	public Circle(int x, int y, int radius) {
		center = new Point(x, y);  //중심점 생성
		this.radius = radius;      //반지름
	}
	
	//원의 정보 출력 메서드
	public void showInfo() {
		System.out.printf("원의 중심은 (%d, %d)이고, 반지름은 %dcm입니다.\n", 
				center.x, center.y, radius);
	}
}
