package arraylist;

import java.util.ArrayList;

public class CartArrayList {

	public static void main(String[] args) {
		ArrayList<String> cartlist = new ArrayList<>();
		
		cartlist.add("커피");
		cartlist.add("계란");
		cartlist.add("생수");
		
		// 리스트 개수
		System.out.println(cartlist.size());
		
		//1개 요소 가져오기
		System.out.println("첫번째 요소: " + cartlist.get(0));
		
		//전체 조회
		for(int i=0; i<cartlist.size(); i++) {
			String cart = cartlist.get(i);
			System.out.println(cart);
		}
		
		// 요소 수정
		cartlist.set(0, "라면");
		
		System.out.println("-------------");
		
		// 요소 삭제
		//cartlist.remove("콩나물");  //예외 발생
		
		if(cartlist.contains("콩나물")) { //"콩나물"이 있으면
			cartlist.remove("콩나물");
		}
	
		for(String cart : cartlist)
			System.out.println(cart);
	}
}
