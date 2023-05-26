package polymorphism;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

//Human 클래스
class Human extends Animal{
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
}

//Tiger 클래스
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 움직입니다.");
	}
}

//Eagle 클래스
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 움직입니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		//다형성 - 부모 타입으로 객체 생성(자동 형변환)
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		moveAnimal(human);
		moveAnimal(tiger);
		moveAnimal(eagle);
	}
	
	//move()를 사용할 메서드 생성 - 매개변수의 다형성
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
