<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/chapter06_1/result.do" method="get">
<table border="1">
<tr>
	<td width="50" align="center">X :</td>
	<td><input type="text" name="x"></td>
</tr>
<tr>
	<td align="center">Y :</td>
	<td><input type="text" name="y"></td>
</tr>
<tr>
	<td colspan="2" align="center">
	<input type="submit" value="계산">
	<input type="reset" value="취소">
	</td>
</tr>
</table>
</form>
</body>
</html>