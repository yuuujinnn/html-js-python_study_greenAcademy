package member;

import java.io.Serializable;
import java.sql.Timestamp;

public class Member implements Serializable{

	private static final long serialVersionUID = 3L;
	
	//필드
	private String memberId;
	private String passwd;
	private String name;
	private String gender;
	private Timestamp joinDate;
	
	//생성자
	public Member() {}
	
	//get, set 메서드
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public Timestamp getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Timestamp joinDate) {
		this.joinDate = joinDate;
	}
}
