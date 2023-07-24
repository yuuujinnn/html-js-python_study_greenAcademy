<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome~</title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div class="container my-3">
		<h3 class="text-left mx-4 my-4">회원 정보</h3>
		<div class="row">
			<div class="form-group row">
				<label class="col-sm-2">아이디</label>
				<div class="col-sm-3 my-2">
					<input type="text" name="mid" readonly
				   		class="form-control" value="${member.mid }">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">비밀번호</label>
				<div class="col-sm-3 my-2">
					<input type="password" name="passwd" readonly
				   		class="form-control" value="${member.passwd}">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">이름</label>
				<div class="col-sm-3 my-2">
					<input type="text" name="mname" readonly
				   		class="form-control" value="${member.mname}">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">성별</label>
				<div class="col-sm-3 my-2">
					<c:if test="${member.gender eq 'male'}">
					<label><input type="radio" name="gender" value="male" checked>남</label>
					<label><input type="radio" name="gender" value="female" >여</label>
					</c:if>
					<c:if test="${member.gender eq 'female'}">
					<label><input type="radio" name="gender" value="male">남</label>
					<label><input type="radio" name="gender" value="female" checked>여</label>
					</c:if>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">생일</label>
				<div class="col-sm-3 my-2">
					<input type="text" name="birth" readonly
				   		class="form-control" value="${member.birth}">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">전화번호</label>
				<div class="col-sm-3 my-2">
					<input type="text" name="phone" readonly
				   		class="form-control" value="${member.phone}">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">이메일</label>
				<div class="col-sm-3 my-2">
					<input type="text" name="email" readonly
				   		class="form-control" value="${member.email}">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">주소</label>
				<div class="col-sm-3 my-2">
					<input type="text" name="address" readonly
				   		class="form-control" value="${member.address}">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">가입일</label>
				<div class="col-sm-3 my-2">
					<%-- <input type="text" name="regDate" readonly
				   		class="form-control" value="${member.regDate}"> --%>
				   		<fmt:formatDate value="${member.regDate }" 
				   				pattern="yyyy-MM-dd HH:mm:ss" />
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>