package collections.list;

import java.util.List;
import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		//Vector - 멀티 스레드 환경에서 사용함
		List<String> vegeList = new Vector<>();
		
		//객체 추가
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		
		//특정 위치에 추가
		vegeList.add(2, "고추");
		
		//"감자"를 상추로 변경 - set()
		vegeList.set(2, "상추");
		System.out.println(vegeList.get(2));
		System.out.println("==============");
		
		//"마늘" 삭제 - remove()
		vegeList.remove("마늘");
		
		//전체 조회(size(), get())
		for(int i=0; i<vegeList.size(); i++) {
			String vegetable = vegeList.get(i);
			System.out.println(vegetable);
		}
	}

}
