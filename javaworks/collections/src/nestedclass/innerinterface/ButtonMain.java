package nestedclass.innerinterface;

public class ButtonMain {

	public static void main(String[] args) {
		
		Button button = new Button();
		
		//전화 걸기
		button.setListener(new CallListener());
		button.touch();
		
		//문자 보내기
		button.setListener(new MessageListener());
		button.touch();
		
		//사진 찍기 - 익명 객체 구현
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		button.touch();
	}

}





