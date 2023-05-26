package classpart;

class Hello{
	public void sayHello() {
		System.out.println("Hello~");
	}
	
	public void sayHello(String name) {
		System.out.println("Hello~ " + name);
	}
}

public class HelloTest {
	public static void main(String[] args) {
		Hello hello = new Hello();
		
		hello.sayHello();
		
		hello.sayHello("기용");
	}
}
