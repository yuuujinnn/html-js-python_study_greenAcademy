package fruits;

public class Fruit {
	//필드
	String name;  //과일 이름
	String weight;  //무게(중량)
	int price;   //가격
	
	//생성자
	public Fruit() {}
	
	//정보 출력 메서드
	public void showInfo() {
		System.out.println("과일 이름: " + name);
		System.out.println("과일 무게: " + weight);
		System.out.println("과일 가격: " + price);
	}
}
