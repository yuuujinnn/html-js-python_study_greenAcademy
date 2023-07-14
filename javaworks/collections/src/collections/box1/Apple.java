package collections.box1;

public class Apple {
	
	private String name;
	
	public Apple(String name) {
		this.name = name;
	}
	
	//이름에 접근하는 방법 1.get, set
	//2. toString() 재정의
	@Override
	public String toString() { return name; }
	 
}
