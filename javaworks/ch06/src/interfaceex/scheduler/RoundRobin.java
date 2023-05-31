package interfaceex.scheduler;

// RoundRobin(구현 클래스)
public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져오기");
	}
	
	@Override
	public void sendCalltoAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
}
