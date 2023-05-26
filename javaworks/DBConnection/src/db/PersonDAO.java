package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//DAO - 데이터베이스 연결 및 연동(입력, 검색, 수정, 삭제) 기능 클래스
public class PersonDAO {
	//필드
	private Connection conn = null;  //연결 처리 클래스
	private PreparedStatement pstmt = null; //sql 처리 클래스

	//자료 삽입
	public void insertPerson(Person person) {
		conn = JDBCUtil.getConnection();
		//String sql = "";
	}
	
	
	//자료 검색(목록)
	public ArrayList<Person> getPersonList(){
		ArrayList<Person> personList = new ArrayList<>();
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM person";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();  //검색 - executeQuery()를 사용
			while(rs.next()) {
				Person person = new Person();  //기본 생성자로 객체 생성
				//person 테이블에서 userid를 가져와서 person 객체의 userId에 저장함
				person.setUserId(rs.getString("userid")); 
				person.setUserPw(rs.getString("userpw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				
				personList.add(person);  //사람 객체를 리스트에 저장
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return personList;  //호출하는 곳으로 반환함(돌려줌)
	}
	
	
}
