package collections.box1;

public class BoxTest {

	public static void main(String[] args) {
		//문자열 자료형 사용
		Box<String> box1 = new Box<>();
		box1.set("행운을 빌어요!");
		String msg = box1.get();
		System.out.println(msg);
		
		//정수형 자료 사용
		Box<Integer> box2 = new Box<>();
		box2.set(100);
		Integer value = box2.get();
		System.out.println(value);
		
		//Apple 자료형 사용
		Box<Apple> box3 = new Box<>();
		Apple apple = new Apple("사과");
		box3.set(apple);
		System.out.println(apple);
	}

}
