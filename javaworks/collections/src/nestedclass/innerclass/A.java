package nestedclass.innerclass;

public class A {
	A(){System.out.println("A 객체가 생성됨");}
	
	//내부 클래스, 중첩 클래스
	//인스턴스 멤버 클래스
	class B{
		int field1;
		
		B(){
			System.out.println("B 객체가 생성됨");
		}
		
		void method1() {}
	}
	
	//정적 멤버 클래스
	static class C{
		C(){System.out.println("C 객체가 생성됨");}
		int field1;  //인스턴스 필드
		static int field2;  //정적 필드
		
		void method1() {}         //인스턴스 매세드
		static void method2() {}  //정적 메서드
	}
	
	//local 클래스(매서드 내부에 존재)
	
	void method() {
		class D{
			D(){System.out.println("D 객체가 생성됨");}
			int field1;
			//static int field2; (공유되므로 지역변수로 사용불가)
			
			void method1() {}
			//static void method2() {}
		}
		D d = new D();
		d.field1 = 1;
		d.method1();
	}
}










