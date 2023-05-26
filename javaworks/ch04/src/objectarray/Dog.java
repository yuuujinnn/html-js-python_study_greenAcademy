package objectarray;

public class Dog {
	private String dogName;
	private String type;
	
	public Dog() {}   //기본 생성자
	
	//강아지 이름을 입력하는 메서드
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	
	//강아지 이름을 가져오는 메서드
	public String getDogName() {
		return dogName;
	}
	
	//강아지 종류를 입력하는 메서드
	public void setType(String type) {
		this.type = type;
	}
	
	//강아지 종류를 가져오는 메서드
	public String getType() {
		return type;
	}
	
}
