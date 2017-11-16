<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/master.css" rel="stylesheet">
<style type="text/css">
#main {
	width: 60%;
	/* margin-left: auto;
 		margin-right: auto; */
	margin: 0 auto;
	/* 		background-color: #666;
  */
	overflow: auto;
	clear: both;
}

#login {
	width: 50%;
	float: left;
	/* background-color: #f00; */
	min-height: 200px;
}

#register {
	width: 50%;
	float: right;
	/* background-color: #ff0; */
	min-height: 200px;
}

form label {
	display: block;
}
</style>
</head>
<body>
	<%@ include file="header.jsp"%>
	<div id="main">
		<div id="login">
			<h1>登录</h1>
			<form action="login.action">
				<div>
					<label>用户名</label> <input name="account" type="text" maxlength="11"
						placeholder="手机号">
				</div>
				<div>
					<label>密码</label> <input name="password" type="password"
						maxlength="6">
				</div>
				<div>
					<label></label><input type="submit">
				</div>
			</form>
		</div>
		<div id="register">
			<h1>注册</h1>
			<form action="register.action">
				<div>
					<label>用户名</label><input name="account">
				</div>
				<div>
					<label>密码</label><input name="password">
				</div>
				<div>
					<label>密码确认</label><input name="password" type="password">
				</div>
				<div>
					<label></label><input type="submit">
				</div>
			</form>
		</div>
	</div>


	<%@ include file="footer.jsp"%>

</body>
</html>