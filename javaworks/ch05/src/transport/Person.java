package transport;

//사람 클래스(참조 자료형)
public class Person {
   
   String name;   
   int age;
   int money;  //가진 돈
   
   Person(String name, int money){
      this.name = name;
      this.money = money;
   }
   
   public void take(Vehicle vehicle, int fee) {
         vehicle.carry(fee);
         this.money -= fee; //가진돈에서 요금만큼 차감
      }
   
   //사람의 정보
   void showInfo() {
      System.out.printf("%s님의 남은 돈은 %,d원입니다\n", 
            name, money);
   }
}