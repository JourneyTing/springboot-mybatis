<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://kit.fontawesome.com/5932be681f.js" crossorigin="anonymous"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gugi&display=swap" rel="stylesheet">
<title>아람</title>
<style>
	html, body {
		height: 100%;
		margin: 0;
		font-family: 'Gugi', cursive;
	}
	.login-all {
   		display: flex;
	    justify-content: center;
   	 	align-items: center;
	 	height: 100%;
	 	background: #bbbbb9;
	}
	.login-section {
		    width: 100%;
	}
	.login-title {
		font-size: 50px;
		font-weight: bold;
	    margin-left: 32%;
	}
	.login-input {
    	display: flex;
	    justify-content: center;
	    align-items: center;
	    width: 30%;
	    padding: 150px 50px;
	    border: 5px solid #CFCFCF;
	    margin: 0 auto;
	    background: #9f9f9f;
	}
	.login {
		height: 110px;
   		font-size: 25px;
	    font-weight: 600;
	}
	input {
		height: 30px;
	}
	.id {
	    margin: 10px 18px;
	}
	.button-section {
		display: flex;
		justify-content: end;
		margin-top: 10px;
	}
	button {
	    padding: 10px 18px;
    	background: lightgray;
    	border-radius: 4px;
    	border-color: darkgray;
    	font-family: 'Gugi', cursive;
	}
	.btn-login {
		margin-left:10px;
	}
</style>
</head>
<body>
	<div class="login-all">
	<div class="login-section">
	<div class="login-title">로그인</div>
		<div class="login-input">
			<div class="login">
				<form>
					아이디 : <input type="text" id="id" class="id" ><br>
					비밀번호 : <input type="password" id="password">
					<div class="button-section">
						<button type="button" >회원가입</button>
						<button onclick="" class="btn-login">로그인</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	</div>
</body>
</html>