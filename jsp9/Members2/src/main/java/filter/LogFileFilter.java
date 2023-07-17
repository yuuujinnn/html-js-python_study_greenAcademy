package filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LogFileFilter implements Filter{

	PrintWriter writer;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String filename = filterConfig.getInitParameter("filename");
		if(filename == null) {
			throw new ServletException("로그파일의 이름을 찾을 수 없습니다."); //강제로 예외 발생
		}
		
		
		try {
			writer = new PrintWriter(new FileWriter(filename, true), true);
		} catch (Exception e) {
			throw new ServletException("로그 파일을 열 수 없습니다.");
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 콘솔에 기록할 내용
		String clientAddr = request.getRemoteAddr(); // IP주소
		writer.printf("클라이언트 IP 주소: %s %n", clientAddr);
		
		long start = System.currentTimeMillis();
		writer.println("접근한 URL 경로:" + getURLPath(request));
		writer.println("요청 처리 시작 시각: " + getCurrentTime());
		chain.doFilter(request, response); //필터 처리
		
		long end = System.currentTimeMillis();
		writer.println("요청 처리 종료 시각: " + getCurrentTime());
		writer.println("요청 처리 소요 시간: " + (end-start) + "ms");
		writer.println("======================================");
		
	}
	
	@Override
	public void destroy() {
		writer.close();
	}
	
	// 현재 날짜와 시간을 가져오는 메서드
	private String getCurrentTime() {
		LocalDateTime now = LocalDateTime.now(); // 날짜 객체 생성
		
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
				
		return now.format(datetime);
	}
	
	private String getURLPath(ServletRequest request) {
		HttpServletRequest req;  //ServletRequest를 상속받은 인터페이스임
		String currentPath = "";
		String queryString = "";
		
		if(request instanceof HttpServletRequest) {
			req = (HttpServletRequest) request;  //다운 캐스팅(형변환)
			currentPath = req.getRequestURI();   //uri
			queryString = req.getQueryString();  //? -> 쿼리 스트링
			queryString = (queryString == null)? "" : "?" + queryString;
		}
		
		return currentPath + queryString;
	}

}



