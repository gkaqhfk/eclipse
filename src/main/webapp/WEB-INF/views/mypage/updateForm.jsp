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
<title>내 정보 수정</title>
<link
	href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:100,300,400,500,700,900&display=swap"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link href="resources/css/sidebar.css" rel="stylesheet">

</head>

<body>
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">My Page</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<fieldset>
		<legend>내 정보 수정</legend>
		<form role="form" action="/mypage/update" method="post" name="fr">
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">


						<!-- /.panel-heading -->
						<div class="panel-body">

							<div class="form-group">
								<label>아이디</label> <input type="text" class="form-control"
									name="username" value='<c:out value="${SignupVO.username}"/>'
									readonly="readonly">
							</div>
							<div class="form-group">
								<label>비밀번호</label> <input type="password" class="form-control"
									name="password" value='<c:out value="${SignupVO.password}"/>'>
							</div>
							<div class="form-group">
								<label>전화번호</label> <input class="form-control" name="tel"
									value='<c:out value="${SignupVO.tel}"/>'>
							</div>

							<div class="form-group">
								<label>자기소개</label>
								<textarea class="form-control" rows="3" name="introducetext"
									value='<c:out value="${SignupVO.introducetext}"/>'></textarea>
							</div>

							<input type="submit" class="btn" value="내 정보 수정"> <input
								type="button" class="btn" value="메인으로"
								onclick="location.href='/includes/header'">
						</div>
						<!--  end panel-body -->

					</div>
					<!--  end panel-body -->
				</div>
			</div>
			<!-- end panel -->
		</form>
	</fieldset>
</body>
</html>