package casting;

public class DownCasting1 {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field1 = "xxx";
		parent.method1();
		parent.method2();
		
//		Child child = (Child)parent;
//		child.method3();
		
		if(parent instanceof Child) {
			Child child = (Child)parent;
			child.method3();
		}
		
	}

}
