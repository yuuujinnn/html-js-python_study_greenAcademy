package address;

import java.io.Serializable;

public class AddrBook implements Serializable{
	
	private static final long serialVersionUID = 10L;
	
	//필드
	private String username; //이름
	private String tel; 	 //전화번호
	private String email;	 //이메일
	private String gender;	 //성별
	
	
	//getter, setter 메서드
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

	
	
}
