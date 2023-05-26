package inheritance.person;

//Person 클래스 상속함
public class Engineer extends Person{
	//필드
	int companyId;
	
	public static void main(String[] args) {
		Engineer eng = new Engineer();
		
		eng.name = "봉구";  //부모 필드에 접근
		eng.age = 27;
		eng.companyId = 256;
	}
}
