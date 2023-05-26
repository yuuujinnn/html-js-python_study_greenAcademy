package taketrans;

//사람 클래스(참조 자료형)
public class Person {
	
	String name;   
	int age;
	int money;  //가진 돈
	
	Person(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	//버스를 타는 기능을 하는 메서드
	//매개변수 - 자료형 변수이름
	void takeBus(Bus bus) {
		bus.take(1300);     //1300원 매개로 전달
		this.money -= 1300; //1300원 차감
	}
	
	//지하철을 타다
	void takeSubway(Subway subway) {
		subway.take(1250);
		this.money -= 1250;
	}
	
	//사람의 정보
	void showInfo() {
		System.out.printf("%s님의 남은 돈은 %,d원입니다\n", 
				name, money);
	}
}
