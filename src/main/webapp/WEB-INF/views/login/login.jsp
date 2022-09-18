<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Login</title>
</head>
 
<body>
  
  <script src="/resources/js/jQuery.serializeObject.js"></script>
	<script type="text/javascript">
	$(function(){
		$("#btnLogin").click(function(){
		 username=$("#username").val();
		 var password=$("#password").val(); if(username == ""){
		  alert("아이디를 입력하세요");
		  $("#username").focus(); //입력포커스 이동

		  return; //함수 종료
		}
		if(password==""){
		 alert("비밀번호를 입력하세요"); 
		 $("#password").focus();
		  return;
		}
		//폼 내부의 데이터를 전송할 주소
		 document.form1.action= "${path}/login/login_check.do";
		 document.form1.submit(); //제출
		 });
		});
		</script>
	<div id="layoutAuthentication_content">
	        <main>
	            <div class="container">
	                <div class="row justify-content-center">
	                    <div class="col-lg-5">
	                        <div class="card shadow-lg border-0 rounded-lg mt-5">
	                            <div class="card-header"><h3 class="text-center font-weight-light my-4">Login</h3></div>
	                            <div class="card-body">
	                                <form name="form1" method="post">
	                                   <div class="form-group has-feedback">
											<label class="control-label" for="username">아이디</label>
											<input class="form-control" type="text" id="username" name="username" />
									   </div>
	                                   <div class="form-group has-feedback">
					                        <label class="control-label" for="password">패스워드</label>
					                        <input class="form-control" type="password" id="password" name="password" />
				                       </div>
	                                  
	                                    <div class="d-flex align-items-center justify-content-between mt-4 mb-0">
	                                       
	                                        <a class="btn btn-primary" id="btnLogin">Login</a>
											<a href="/signup/signup.do" class="btn btn-primary">회원가입</a>
	                                    </div>
	                                </form>
	                            </div>
	                        </div>
	                    </div>
	                </div>
	            </div>
	        </main>
	    </div>
</body>
</html>