package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import collections.member.Member;

//Member 관리 - Map 자료구조
public class MemberHashMap {
	
	Map<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	//회원 추가 put(회원아이디, 객체)
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	//회원 목록 보기
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();	//다음 key를 가져옴
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
	
	//회원 1명 보기
	public void showOneMember(int memberId) {
		//containsKey(object) : 객체가 포함되어 있는지 여부
		if(hashMap.containsKey(memberId)) {
			Member member = hashMap.get(memberId);
			System.out.println(member);
			return;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
	}
	
	//회원 삭제
	public void removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
	}
}
