package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerMain {

	public static void main(String[] args) throws IOException {
		// 입력 방식 - System.in.read()
		System.out.println("전화 상담 배분 방식을 선택하세요. ");
		System.out.println("R: 한명씩 차례로 배분");
		System.out.println("L: 현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 배분");
		System.out.println("P: 우선 순위가 높은 고객 먼저 배분");
		
		int ch = System.in.read();	// read() 반환값이 int형이므로 char 쓰지 않음
		
		// 객체 생성 시 다형성 활용
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;	 // 프로그램을 즉시 종료
		}
		scheduler.getNextCall();  // 중복을 줄이는 효과
		scheduler.sendCalltoAgent();
	}
}