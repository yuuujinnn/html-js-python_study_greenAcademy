package protectedex.pack2;

import protectedex.pack1.A;

public class D extends A{
	// 상속관꼐에서는 자식 클래스에게 제한이 허용됨
	public D() {
		super();
		this.filed = "good";
		this.method();
	}
}