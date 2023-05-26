package casting;

import java.util.ArrayList;

class Animal{
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
}

class Human extends Animal{
	public void breathe() {
		System.out.println("사람이 숨을 쉽니다.");
	}
	
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void breathe() {
		System.out.println("호랑이가 숨을 쉽니다.");
	}
	
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void breathe() {
		System.out.println("독수리가 숨을 쉽니다.");
	}
	
	public void fly() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest {
	
	static ArrayList<Animal> animalList = new ArrayList<>();
	
	public static void main(String[] args) {
		animalList.add(new Human());
		animalList.add(new Tiger());
		animalList.add(new Eagle());
		
		/* Human 클래스를 다운 캐스팅함
		Animal animal = animalList.get(0);
		animal.breathe();
		
		if(animal instanceof Human) { //animal이 Human 클래스의 객체 라면
			Human human = (Human)animal;
			human.read();
		}*/
		System.out.println("*** 원래 형으로 다운 캐스팅 ***");
		testCasting();  
	}
	
	public static void testCasting() {
		
		for(int i=0; i<animalList.size(); i++) {
			Animal animal = animalList.get(i);
			animal.breathe();
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.read();
			}else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunt();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.fly();;
			}else {
				System.out.println("지원하지 않는 타입입니다.");
			}
		}
	}

}
