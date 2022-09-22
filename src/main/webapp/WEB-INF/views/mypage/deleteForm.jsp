<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원 탈퇴</title>
<link
	href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:100,300,400,500,700,900&display=swap"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link href="resources/css/sidebar.css" rel="stylesheet">

</head>
<body>
	<%
	// 로그인 처리 -> 로그인 x (로그인페이지 이동)
	String username = (String) session.getAttribute("username");
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
			<h1 class="page-header">회원 탈퇴</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>

	<fieldset>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">


					<!-- /.panel-heading -->
					<div class="panel-body">

						<form action="/mypage/delete" method="post">
							<!-- input타입중 hidden은 화면에 있는 해당 input태그를 숨겨서 정보 전달   -->
							<div class="form-group">
								<label>아이디</label> <input type="text" class="form-control"
									name="username" value="<%=username%>" readonly>
							</div>
							<div class="form-group">
								<label>비밀번호</label> <input type="password" class="form-control"
									name="password">
							</div>

							<input type="submit" class="btn" value="탈퇴하기"> <input
								type="button" class="btn" value="뒤로가기"
								onclick="location.href='/mypage/info'">
					</div>
					<!--  end panel-body -->

				</div>
				<!--  end panel-body -->
			</div>
		</div>

		</form>
	</fieldset>
</body>
</html>