package inheritance.car;

import java.util.ArrayList;

public class CarArrayList {

	public static void main(String[] args) {
		// 자동차 3대 생성 - ArrayList에 저장
		ArrayList<Car> carList = new ArrayList<>();
		
		// 자동차 객체 생성
		Car car1 = new Car("소나타", 2500);
		Car car2 = new Car("모닝", 1000);
		Car car3 = new Car("BMW", 3000);
		
		// 자동차 객체 저장
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		
		/* 익명 객체
		carList.add(new Car("소나타", 2500));
		carList.add(new Car("모닝", 1000));
		carList.add(new Car("BMW", 3000));
		*/
		
		// 특정한 요소 1개 검색
		System.out.println(carList.get(1).carInfo());
		
		// 전체 요소 출력
		for(int i=0; i<carList.size(); i++) {
			Car car = carList.get(i);
			System.out.println(car.carInfo());
		}
	}

}
