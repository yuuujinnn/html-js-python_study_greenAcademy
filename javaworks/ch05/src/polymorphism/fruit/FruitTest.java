package polymorphism.fruit;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------");
	    System.out.println("1.포도 | 2.복숭아 | 3.바나나");
	    System.out.println("------------------------");
	    System.out.print("선택> ");
	    
	    //메뉴 선택 변수
	    int selectNo = Integer.parseInt(sc.nextLine()); 
		
		Fruit fruit = null;
		
		if(selectNo == 1) {
			fruit = new Grape();
		}else if(selectNo == 2) {
			fruit = new Peach();
		}else if(selectNo == 3) {
			fruit = new Banana();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
		}
		
		fruit.fruitInfo();
		sc.close();
	}

}
