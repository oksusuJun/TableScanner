<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<script>
	$(function() {
		$(".login").on("click", function() {
			$(".dialog_back").css({
				"display" : "block"
			});
		});
		$(".join_button").on("click", function() {
			$(".dialog_login").css({
				"display" : "none"
			});
			$(".dialog_join").css({
				"display" : "block"
			})

		});

	});
</script>
<style type="text/css">
/*header css */
header {
	width: 100%;
	height: 60px;
	background-color: #dc1400;
	min-width: 1080px;
	float: left;
}

.header>a {
	float: left;
}

.header_content {
	height: 100%;
	width: 1080px;
	text-align: left;
}

.logo {
	width: 250px;
	height: 100%;
	text-align: left;
}

.logo>a {
	color: #fff;
	font-weight: bold;
}
.header_content > a{
	float: left;
}
.menu {
	height: 100%;
	float: right;
	width: 30%;
}

.mainmenu {
	width: 30%;
	height: 100%;
	float: left;
}

.menu>button {
	background: rgba(0, 0, 0, 0);
	color: #fff;
	outline: 0;
	border: 1.5px solid #ea7266;
	border-radius: 5px;
	width: 100px;
	height: 40px;
	font-size: 18px;
	margin-top: 10px;
	cursor: pointer;
}

/*팝업창 공통정보 css*/
.dialog_back {
	background: rgba(0, 0, 0, 0.5);
	width: 100%;
	height: 100%;
	position: absolute;
	display: none;
	z-index: 20
}

/*로그인 팝업창 css*/
.dialog_login {
	position: fixed;
	background: #fff;
	width: 400px;
	height: 500px;
	left: calc(50% - 200px);
	top: calc(50% - 250px);
}

.login_form_logo {
	margin-top: 40px;
	width: 100%;
	height: 20%;
}

.dialog_login>form {
	text-align: left;
}

.dialog_login>form>input {
	width: calc(100% - 80px);
	margin-left: 40px;
	margin-right: 40px;
	height: 40px;
	margin-top: 10px;
}

.Search {
	margin-left: 40px;
	margin-top: 10px;
	margin-bottom: 10px;
	text-align: left;
}

.Search>a:hover {
	color: red;
}

.submit {
	border-radius: 10px;
	outline: 0;
	background: #fff;
	border: 1px solid #000;
	cursor: pointer;
}

.join_div {
	margin-top: 10px;
	width: calc(100% - 80px);
	margin-left: 40px;
	margin-right: 40px;
	height: 20%;
}

.join_div>span {
	float: left;
	margin-top: 13px;
	margin-left: 20px;
	font-size: 16px;
}

.join_div>button {
	width: 100px;
	height: 50px;
	float: right;
	margin-right: 20px;
}

/*회원가입 팝업창 css*/
.dialog_join {
	position: fixed;
	background: #fff;
	width: 400px;
	height: 600px;
	left: calc(50% - 200px);
	top: calc(50% - 300px);
	display: none;
}

.dialog_join>form>input {
	width: calc(100% - 80px);
	margin-left: 40px;
	margin-right: 40px;
	height: 40px;
	margin-top: 10px;
}

.join_form_logo {
	margin-top: 40px;
	width: 100%;
	height: 20%;
}

.gender {
	width: calc(100% - 80px);
	margin-left: 40px;
	margin-right: 40px;
	height: 23px;
	font-size: 18px;
	padding-top: 7px;
}

.gender>* {
	float: left;
	margin-left: 20px;
}

.gender>input {
	margin-top: 8px;
}
</style>
<!-- 팝업창 -->
<div class="dialog_back">

	<!-- 로그인 팝업창 -->
	<div class="dialog_login">
		<div class="login_form_logo">logo</div>
		<form action="/TableScanner/login.do" method="post">
		<sec:csrfInput/>
			<input type="text" name="userId" placeholder="ID를 입력해주세요."> 
			<input type="password" name="userPassword" placeholder="Password를 입력해주세요.">
			<div class="Search">
				<a href="#" class="SearchId">아이디 찾기 </a> <a href="#" class="SearchPassword">비밀번호 찾기 </a>
			</div>
			<input type="submit" class="submit">
		</form>
		<div class="join_div">
			<span>회원가입 하시겠어요?</span>
			<button class="join_button">회원가입</button>
		</div>
	</div>

	<!-- 회원가입 팝업창 -->
	<div class="dialog_join">
		<div class="join_form_logo">logo</div>
		<form method="post" action="/TableScanner/noshow/insertmember.do">
			<input type="text" name="id" placeholder="ID를 입력해주세요."> 
			<input type="password" name="password" placeholder="Password를 입력해주세요.">
			<input type="text" name="name" placeholder="name를 입력해주세요.">
			<div class="gender">
				<label>남성</label> <input type="radio" name="gender" class="radio" value="male"> 
				<label>여성</label> <input type="radio" name="gender" class="radio" value="female">
			</div>
			<input type="text" name="birthday" placeholder="생년월일를 입력해주세요.">
			<input type="text" name="tel" placeholder="전화번호를 입력해주세요."> 
			<input type="text" name="email" placeholder="Email을 입력해주세요."> 
			<input type="submit" class="submit">
		</form>
	</div>

</div>

<header>
	<div class="header_content">
		<a href="#"> <span style="line-height: 60px; font-size: 32px;">TableScanner</span>
		</a>
		<div class="mainmenu"></div>
		<div class="menu">
			<button class="login">로그인</button>
		</div>
	</div>
</header>