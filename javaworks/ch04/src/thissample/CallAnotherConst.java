package thissample;

class Person{
	String name;
	int age;
	
	Person(){
		this("이름 없음", 1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItself() {
		return this;
	}
}


public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItself();
		
		System.out.println(noName);
		System.out.println(p);
	}
}
