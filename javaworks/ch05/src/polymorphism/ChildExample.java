package polymorphism;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = new Child(); //부모 타입(형)으로 객체 생성
		
		child.method1();
		child.method2();
		
		parent.method1(); //자식 클래스의 메서드가 호출됨
		parent.method2();
	}

}
