package taketrans;

public class TakeTrans {

	public static void main(String[] args) {
		Student sohee = new Student("박소희", 10000);
		Student minsang = new Student("안민상", 20000);
				
		Bus bus100 = new Bus("bus100");
		
		sohee.take(bus100, 1300);
		minsang.take(bus100, 1300);
		
		sohee.showInfo();   
		minsang.showInfo();
		
		bus100.showInfo();
	}

}
