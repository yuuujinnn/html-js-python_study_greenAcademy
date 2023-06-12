<%@page import="java.io.File"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
	table, th, td{border: 1px solid #ccc; border-collapse: collapse;}
	table th, td{padding: 10px;}
</style>
<%
	String realFolder = "C:/Users/kiyon/git/jspworks3/chap01/src/main/webapp/upload";

	MultipartRequest multi = new MultipartRequest(request, realFolder, 5*1024*1024,
			"utf-8", new DefaultFileRenamePolicy());
	
	//요청 파라미터중 name 가져옴(file name 제외)
	String name1 = multi.getParameter("name1");
	String title1 = multi.getParameter("title1");
	
	String name2 = multi.getParameter("name2");
	String title2 = multi.getParameter("title2");
	
	String name3 = multi.getParameter("name3");
	String title3 = multi.getParameter("title3");
	
	//요청 파라미터중 file name 가져옴
	Enumeration<String> files = multi.getFileNames();
	
	String file3 = files.nextElement();
	String filename3 = multi.getFilesystemName(file3);
	
	String file2 = files.nextElement();
	String filename2 = multi.getFilesystemName(file2);
	
	String file1 = files.nextElement();
	String filename1 = multi.getFilesystemName(file1);
	
%>
<table>
  <tr>
    <th>이름</th>
    <th>제목</th>
    <th>파일</th>
  </tr>
  <%
  	out.println("<tr><td>" + name1 + "</td>");
  	out.println("<td>" + title1 + "</td>");
  	out.println("<td>" + filename1 + "</td></tr>");
  	
  	out.println("<tr><td>" + name2 + "</td>");
  	out.println("<td>" + title2 + "</td>");
  	out.println("<td>" + filename2 + "</td></tr>");
  	
  	out.println("<tr><td>" + name3 + "</td>");
  	out.println("<td>" + title3 + "</td>");
  	out.println("<td>" + filename3 + "</td></tr>");
  %>
</table>


