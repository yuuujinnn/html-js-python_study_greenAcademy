package shelf;

public interface Queue {
	//자료구조 - 선입선출 방식(FIFO : First In First Out)
	void enQueue(String title);  //리스트의 맨 마지막에 추가
	
	String deQueue();  //리스트의 맨 처음 항목 반환(0번 인덱스)
	
	int getSize(); //현재 Queue에 있는 개수 반환
	
	
}
