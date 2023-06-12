<%@page import="java.io.File"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String realFolder = "C:/Users/kiyon/git/jspworks3/chap01/src/main/webapp/upload";

	MultipartRequest multi = new MultipartRequest(request, realFolder, 5*1024*1024,
			"utf-8", new DefaultFileRenamePolicy());
	
	//요청 파라미터중 name 가져옴(file name 제외)
	Enumeration<String> params = multi.getParameterNames();
	while(params.hasMoreElements()){
		String name = params.nextElement();
		String value = multi.getParameter(name);
		out.println(name + ", " + value + "<br>");
	}
	out.println("========================================<br>");
	
	//요청 파라미터중 file name 가져옴
	Enumeration<String> files = multi.getFileNames();
	while(files.hasMoreElements()){
		String name = files.nextElement();
		String fileName = multi.getFilesystemName(name);
		String originName = multi.getOriginalFileName(name);
		String type = multi.getContentType(name);
		File file = multi.getFile(name);
		
		out.println("요청 파라미터 이름: " + name + "<br>");
		out.println("업로드된 파일 이름: " + fileName + "<br>");
		out.println("원본 파일 이름: " + originName + "<br>");
		out.println("파일 컨텐츠 유형: " + type + "<br>");
		
		if(file != null)
			out.println("파일 크기: " + file.length() + "B");

%>
<p>이미지 보기</p>
<img src="../upload/<%=fileName %>">
<%} %>



