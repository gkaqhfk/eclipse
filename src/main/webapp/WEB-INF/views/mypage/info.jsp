
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<%
	// 로그인 처리 -> 로그인 x (로그인페이지 이동)
	String username = (String) session.getAttribute("username");
	String tel = (String) session.getAttribute("tel");
	String introducetext = (String) session.getAttribute("introducetext");
	if (username == null) {
		response.sendRedirect("/login/login.do");
	}
	%>
<body>

<div class="menu">
    <label for="expand-menu"><div>메뉴</div></label><input type="checkbox" id="expand-menu" name="expand-menu">
    <ul>
        <li><a href="/mypage/info" class="item"><div>내 정보</div></a></li>
        <li><a href="#" class="item"><div>내가 쓴 글</div></a></li>
        <li><a href="#" class="item"><div>내가 쓴 댓글</div></a></li>
        <li><a href="#" class="item"><div>메시지</div></a></li>
        <li><a href="/mypage/delete" class="item"><div>회원 탈퇴</div></a></li>
    </ul>
</div>
    
<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">My Page</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<fieldset>
<!-- /.row -->
<form role="form" action="/mypage/info" method="post" name="fr">
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">

			
			<!-- /.panel-heading -->
			<div class="panel-body">


				<div class="form-group">
								<label>아이디</label> <input type="text" class="form-control"
									name="username" value="<%=username%>" readonly>
							</div>
							

				<div class="form-group">
					<label>전화번호</label> <input class="form-control" name="tel"
						value="<%=tel%>" readonly>
				</div>

				<div class="form-group">
				
						<label>자기소개</label> <input class="form-control" name="introducetext"
						value="<%=introducetext%>" readonly>
				</div>

				<input type="button" value="메인으로" class="btn"
					onclick="location.href='/mypage/mypage.do'"> <input
					type="button" value="내 정보 수정" class="btn"
					onclick="location.href='/mypage/mypageupdate'">
			</div>
			<!--  end panel-body -->

		</div>
		<!--  end panel-body -->
	</div>
	<!-- end panel -->
	</form>
	</fieldset>
</div>
<!-- /.row -->
</body>
</head>
</html>