package collections.map;

import collections.member.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberMap = new MemberHashMap();
		
		//회원 생성
		memberMap.addMember(new Member(101, "이순신"));
		memberMap.addMember(new Member(102, "안산"));
		memberMap.addMember(new Member(103, "추신수"));
		memberMap.addMember(new Member(102, "김연아"));
		
		//회원 목록 조회
		memberMap.showAllMember();
		System.out.println("=============================");
		
		//회원 1명 조회
		memberMap.showOneMember(103);
		
		//회원이 없는 경우
		memberMap.showOneMember(104);
		
		//회원 삭제 (102번)
		memberMap.removeMember(102);
		System.out.println("============================");
		
		//전체 조회
		memberMap.showAllMember();
		
	}
}
