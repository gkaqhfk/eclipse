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
    <title>mypage</title>
	<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:100,300,400,500,700,900&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="resources/css/sidebar.css" rel="stylesheet">
  
</head>
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
    
</body>
</html>