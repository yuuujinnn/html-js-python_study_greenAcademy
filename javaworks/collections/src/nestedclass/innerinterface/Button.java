package nestedclass.innerinterface;

public class Button {
	
	private OnClickListener listener;  //내부 인터페이스 필드
	
	interface OnClickListener{ //내부 인터페이스
		public void onClick();
	}
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//버튼이 터치하는 메서드
	public void touch() {
		listener.onClick();
	}
}
