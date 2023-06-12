package member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		String phone = request.getParameter("phone");
		String[] subject = request.getParameterValues("subject");
		
		System.out.println("아이디: " + userid);
		System.out.println("비밀번호: " + passwd);
		System.out.println("전화번호: " + phone);
		System.out.print("선택한 과목:");
		for(String subj : subject) {
			System.out.print(subj + " ");
		}
	}
}
