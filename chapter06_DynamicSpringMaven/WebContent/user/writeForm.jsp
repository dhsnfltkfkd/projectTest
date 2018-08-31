<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="writeForm" action="/chapter06_DynamicSpringMaven/user/write.do" method="post">
<h3>*****회원가입******</h3>
<table>
<tr>
	<td>이름</td>
	<td>
		<input type="text" name="name" id="name">
		<div id="nameDiv"></div>
	</td>
</tr>
<tr>
	<td>아이디</td>
	<td>
		<input type="text" name="id" id="id">
		<input type="button" value="중복체크" id="checkId">
		<div id="idDiv"></div>
	</td>
</tr>
<tr>
	<td>패스워드</td>
	<td>
		<input type="password" name="pwd" id="pwd">
		<div id="pwdDiv"></div>
	</td>
</tr>
<tr>
	<td colspan="2" align="center">
	<input type="button" id="writeBtn" value="등록">
	<input type="reset" value="다시작성">
	</td>
</tr>
</table>
</form>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){	
	$('#name').keyup(function(){
		if($(this).val().length==0)
			$('#nameDiv').text('이름입력').css('color','red').css('font-size','8pt');
		else
			$('#nameDiv').text('');
	});
	$('#id').keyup(function(){
		if($(this).val().length==0)
			$('#idDiv').text('아이디입력').css('color','red').css('font-size','8pt');
		else
			$('#idDiv').text('');
	});
	$('#pwd').keyup(function(){
		if($(this).val().length==0)
			$('#pwdDiv').text('비밀번호입력').css('color','red').css('font-size','8pt');
		else
			$('#pwdDiv').text('');
	});
	
	//아이디 중복체크
	$('#checkId').click(function(){
		$.ajax({
			type : 'POST',
			url : '/chapter06_DynamicSpringMaven/user/checkId.do',	
			data : {'id' : $('#id').val()}, //'id='+$('#id').val()
			dataType : 'text',
			success : function(data){
				if(data=='exist'){
					$('#idDiv').text('사용 불가능').css('color','blue').css('font-size','8pt');
				}else if(data=='not_exist'){
					$('#idDiv').text('사용 가능').css('color','blue').css('font-size','8pt');
				}else if(data=='empty'){
					$('#idDiv').text('먼저 아이디 입력').css('color','blue').css('font-size','8pt');
				}
				
			}
		});
	});
	
	//등록
	$('#writeBtn').click(function(){
		if($('#name').val()=='')
			$('#nameDiv').text('이름입력').css('color','red').css('font-size','8pt');
		else if($('#id').val()=='')
			$('#idDiv').text("아이디입력").css('color','red').css('font-size','8pt');
		else if($('#pwd').val()=='')
			$('#pwdDiv').text("비밀번호입력").css('color','red').css('font-size','8pt');
		else
			document.writeForm.submit();
	});
});
</script>
</body>
</html>














