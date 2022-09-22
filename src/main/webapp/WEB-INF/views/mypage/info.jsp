
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
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
					<label>아이디</label> <input class="form-control" name="username"
						value='<c:out value="${SignupVO.username}"/>' readonly="readonly">
				</div>

				<div class="form-group">
					<label>전화번호</label> <input class="form-control" name="tel"
						value='<c:out value="${SignupVO.tel}"/>' readonly="readonly">
				</div>

				<div class="form-group">
					<label>자기소개</label>
					<textarea class="form-control" rows="3" name="introducetext"
						value='<c:out value="${SignupVO.introducetext}"/>' readonly="readonly"></textarea>
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
</html>