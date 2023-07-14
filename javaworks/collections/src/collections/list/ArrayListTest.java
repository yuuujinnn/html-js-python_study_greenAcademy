package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		//부모형으로 ArrayList 객체 생성
		List<String> vegeList = new ArrayList<>();
		
		//crud(생성, 조회, 수정, 삭제)
		//자료 생성 - add()
		vegeList.add("양파");  //0번 인덱스
		vegeList.add("마늘");  //1
		vegeList.add("감자");  //2
		
		//개체 수 - size()
		System.out.println(vegeList.size() + "개");
		
		//1개 검색 - get()
		String str = vegeList.get(0);
		System.out.println(str);
		System.out.println("===================");
		
		//1개 수정("마늘" -> "고추") - set()
		vegeList.set(1, "고추");
		System.out.println(vegeList.get(1));
		System.out.println("===================");
		
		//"감자" 삭제 - remove()
		vegeList.remove("감자");
		
		//전체 검색
		for(int i=0; i<vegeList.size(); i++) {
			String vegetable = vegeList.get(i);
			System.out.println(vegetable);
		}
		
		//향상 for문
		for(String vege : vegeList)
			System.out.println(vege);
	}
}
