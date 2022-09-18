<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>회원가입</title>
</head>
<body>


	<div id="layoutAuthentication_content">
		<main>
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-lg-5">
						<div class="card shadow-lg border-0 rounded-lg mt-5">
							<div class="card-header">
								<h3 class="text-center font-weight-light my-4">회원가입</h3>
							</div>
							<div class="card-body">


								<form action="/signup/signup.do" name="frm" id="frm"
									method="post">
									<div class="form-group has-feedback">
										<label class="control-label" for="username">아이디</label> <input
											class="form-control" type="text" id="username"
											name="username" />
									</div>
									<div class="col-12">
										<button type="button" class="btn btn-primary" id="idck">id
											중복확인</button>
									</div>
									<div class="form-group has-feedback">
										<label class="control-label" for="password">패스워드</label> <input
											class="form-control" type="password" id="password"
											name="password" />
									</div>
									<div class="form-group has-feedback">
										<label class="control-label" for="tel">전화번호</label> <input
											class="form-control" type="text" id="tel" name="tel" />
									</div>
									<div class="form-group has-feedback">
										<label class="control-label" for="Introducetext">자기소개</label>
										<input class="form-control" type="textarea" id="Introducetext"
											name="Introducetext" />
									</div>


									<div class="form-group has-feedback">
										<button class="btn btn-success" type="submit" id="submit"
											onclick="return DosignUp();">회원가입</button>
										<a href="home.jsp" class="btn btn-primary">취소</a>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</main>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
	<script src="/resources/js/jQuery.serializeObject.js"></script>
	<script type="text/javascript">
		function DosignUp() {

			var username = $("#username").val();
			var password = $("#password").val();
			var tel = $("#tel").val();
			var introducetext = $("#introducetext").val();

			if (username.length == 0) {
				alert("아이디를 입력해 주세요");
				$("#username").focus();
				return false;
			}

			if (password.length == 0) {
				alert("비밀번호를 입력해 주세요");
				$("#password").focus();
				return false;
			}

			if (tel.length == 0) {
				alert("전화번호를 입력해주세요");
				$("#tel").focus();
				return false;
			}

			if (introducetext.length == 0) {
				alert("자기소개를 입력해주세요");
				$("#introducetext").focus();
				return false;
			}

			if (confirm("회원가입을 하시겠습니까?")) {
				alert("회원가입을 축하합니다");
				return true;
			}
		}
		//아이디 체크여부 확인 (아이디 중복일 경우 = 0 , 중복이 아닐경우 = 1 )
		var idck = 0;
		$(function() {
			//idck 버튼을 클릭했을 때
			$("#idck").click(function() {
				console.log('click');
				//userid 를 param.
				var userid = $("#username").val();

				$.ajax({
					async : true,
					type : 'POST',
					data : JSON.stringify({
						username : userid
					}),
					url : "idcheck.do",
					dataType : "json",
					processData : false,
					contentType : "application/json; charset=UTF-8",
					success : function(data) {
						if (data.cnt > 0) {

							alert("아이디가 존재합니다. 다른 아이디를 입력해주세요.");
							//아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
							$("#divInputId").addClass("has-error")
							$("#divInputId").removeClass("has-success")
							$("#username").focus();

						} else {
							alert("사용가능한 아이디입니다.");
							//아이디가 존제할 경우 빨깡으로 , 아니면 파랑으로 처리하는 디자인
							$("#divInputId").addClass("has-success")
							$("#divInputId").removeClass("has-error")
							$("#username").focus();
							//아이디가 중복하지 않으면  idck = 1
							idck = 1;

						}
					},
					error : function(error) {

						alert("error : " + error);
					}
				});
			});
		});
	</script>
</body>
</html>
