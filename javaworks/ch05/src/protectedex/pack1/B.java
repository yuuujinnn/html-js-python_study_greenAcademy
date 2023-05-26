package protectedex.pack1;

public class B {
	
	public void method() {
		//같은 패키지에서는 protected 접근제한자가 허용됨
		A a = new A();
		a.filed = "ok";
		a.method();
	}
	
}
