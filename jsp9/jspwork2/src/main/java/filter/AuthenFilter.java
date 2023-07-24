package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthenFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("AuthenFilter 초기화...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain) throws IOException, ServletException {
		// 필터를 사용하여 한글 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		// 컨텐츠 유형 명시(텍스트나 html인 경우)
		response.setContentType("text/html; charset=utf-8");
		
		//필터를 사용하여 입력값 오류 출력하기
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		
		if(username == "" || username.equals("")) {
			out.println("이름을 입력하지 않았습니다.");
			return;  //바로 종료
		}
	
		chain.doFilter(request, response); //필터 처리
	}
	
	@Override
	public void destroy() {
		System.out.println("AuthenFilter 해제...");
	}

}
