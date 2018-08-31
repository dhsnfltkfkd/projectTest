<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<form  method="GET" action="/chapter06_1/result.do">
<body>
<table border="1" >
	<tr>
		<td>이름 :</td>
		<td><input type="text" name="name"></td>
	</tr>
		<tr>
		<td>국어 :</td>
		<td><input type="text" name="kor"></td>
	</tr>
		<tr>
		<td>영어 :</td>
		<td><input type="text" name="eng"></td>
	</tr>
		<tr>
		<td>수학 :</td>
		<td><input type="text" name="math"></td>
	</tr>
	<tr colspan="2" align="center">
		<td><input type="submit" value="성적계산"></td>
		<td><input type="reset" value="다시작성"></td>
	</tr>

</table>
</form>
</body>
</html>