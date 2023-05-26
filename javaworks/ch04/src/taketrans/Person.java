package taketrans;

public class Person {
	String name;
	int age;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1200);
		this.money -= 1200;
	}
	
	
	public void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d원입니다.\n", name, money);
	}
}
