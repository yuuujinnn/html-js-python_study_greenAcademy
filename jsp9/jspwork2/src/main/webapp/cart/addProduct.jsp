<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");	

	//상품을 추가할 리스트(장바구니) 생성
	List<String> productList = (ArrayList)session.getAttribute("cartList");
	
	if(productList == null){
		productList = new ArrayList<>();
		session.setAttribute("cartList", productList);
	}

	String product = request.getParameter("product");
	
	//상품을 장바구니에 저장
	productList.add(product);

%>
<script>
	alert("<%=product %>가(이) 추가되었습니다.");
	history.go(-1);
</script>