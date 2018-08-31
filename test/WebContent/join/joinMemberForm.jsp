<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="../js/write.js"></script>
</head>
<body>
<header align = "center">
	<h1>회원가입창</h1>
</header>
<section align="center">
	<article>
		<img src="../image/lion.gif" width="50" heigh="50" onclick="location.href='../mainVeiw/mainView.jsp'">    
	</article>
	<article>
	<div id="cname" name="cname">&nbsp;&nbsp;이름&nbsp;&nbsp;&nbsp;
		<input type="text" id="uname" name="uname">
	</div>
	<div id="checkNameDiv" name="checkNameDiv"></div>
	아이디&nbsp;&nbsp;
		<input type="text" id="uid" name="uid">
	</div>
	<div id="checkIdDiv" name="checkIdDiv"></div>
	<div align="center" id="uidDiv" name="id">	
		비밀번호<input type="text" id="ps" name="ps"><br/>
	</div>
	<div  name="checkPsDiv" id="checkPsDiv" ></div>
	<div>재확인&nbsp;&nbsp;<input type="text" id="rps" name="rps">
	</div>
	<div  name="checkRpsDiv" id="checkRpsDiv" ></div>
		<input type="button" value="회원가입" name="createBtn" id="createBtn">
	</article>
</section>


</body>
</html>