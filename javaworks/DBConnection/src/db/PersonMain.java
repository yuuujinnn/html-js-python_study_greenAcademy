package db;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		
		// Person 자료 검색(목록 조회)
		PersonDAO dao = new PersonDAO();
		
		//자료 삽입
		Person person1 = new Person("sky", "sky1234", "강하늘", 30);
		//dao.insertPerson(person1); //dao의 insertPerson() 호출
		
		//자료 1개 검색
		Person person = dao.getPerson("cloud");
		String userId = person.getUserId();
		String userPw = person.getUserPw();
		String name = person.getName();
		int age = person.getAge();
		
		System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d\n", 
				   userId, userPw, name, age);
		
		System.out.println("=================================================");
		
		//전체 목록 검색
		/*ArrayList<Person> personList = dao.getPersonList();
		for(int i=0; i<personList.size(); i++) {
			Person person = personList.get(i);  //어레이리스트의 요소를 가져와서
			
		   String userId = person.getUserId();
		   String userPw = person.getUserPw();
		   String name = person.getName();
		   int age = person.getAge();
		   
		   System.out.printf("아이디: %s, 비밀번호: %s, 이름: %s, 나이: %d\n", 
				   userId, userPw, name, age);
		}*/

	}

}
