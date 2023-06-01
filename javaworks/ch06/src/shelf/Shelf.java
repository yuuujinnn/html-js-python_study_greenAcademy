package shelf;

import java.util.ArrayList;

public class Shelf {
	//자료 구조(물리적) - ArrayList
	//private인데 상속을 위해서 protected로 변경함
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
}
