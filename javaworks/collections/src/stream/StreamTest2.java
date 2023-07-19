package stream;

import java.util.Arrays;

public class StreamTest2 {
	
	public static void main(String[] args) {
		//정수형 배열에서 사용
		int[] num = {1, 2, 3, 4};
		
		for(Integer n : num)
			System.out.println(n);
		
		//stream을 얻어서 출력
		Arrays.stream(num).forEach(n -> System.out.println(n));
		
		//스트림을 얻어 합계 구하기
		int sum = Arrays.stream(num).sum();
		int count = (int)Arrays.stream(num).count();
		double avg = (double) sum / count;
		
		System.out.println("합계: " + sum);
		System.out.println("개수: " + count);
		System.out.println("평균: " + avg);
		
	}
}
