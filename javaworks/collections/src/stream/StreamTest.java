package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		//ArrayList > Arrays
		//회사를 여러 개 저장
//		List<String> companyList = new ArrayList<>();
//		companyList.add("현대");
//		companyList.add("삼성");
//		companyList.add("엘지");
		
		//Arrays 클래스 사용
		List<String> companyList = Arrays.asList("현대", "삼성", "LG");
		
		for(String company : companyList)
			System.out.println(company);
		
		//Stream 클래스 - 람다식
		//1번만 생성(소비-consumer)되므로 또 사용할때는 다시 생성함
		Stream<String> stream = companyList.stream();
		stream.forEach(company -> System.out.println(company));
	}
}
