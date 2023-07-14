package collections.box1;

// 제네릭(Generic) 클래스 생성(정의)
public class Box<T> {
	private T type;
	
	public void set(T type) {
		this.type = type;
	}
	
	public T get() {
		return type;
	}
}
