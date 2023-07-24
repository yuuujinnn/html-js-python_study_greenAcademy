package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class InitParamFilter implements Filter{
	
	private FilterConfig filterConfig = null;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		System.out.println("InitParamFilter 초기화...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//한글 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		//인증 처리
		String id = request.getParameter("id");
		String pw = request.getParameter("passwd");
		
		//web.xml 필터 설정 참조
		String param1 = filterConfig.getInitParameter("param1");
		String param2 = filterConfig.getInitParameter("param2");
		
		if(id.equals(param1) && pw.equals(param2)) {
			out.println("로그인 성공!");
		}else {
			out.println("로그인 실패!");
		}
		
		chain.doFilter(request, response);  //필터 처리
	}
	
	@Override
	public void destroy() {
		System.out.println("InitParamFilter 해제...");
	}

}
