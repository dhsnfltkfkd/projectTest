<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" frame="hsides" rules="rows" cellpadding="5">
<tr>
	<td colspan="3"><font size="5">${boardDTO.subject }</font></td>
</tr>

<tr>
	<td width="150">글번호 : ${boardDTO.seq }</td>
	<td width="150">작성자 : ${boardDTO.id }</td>
	<td width="150">조회수 : ${boardDTO.hit }</td>
</tr>

<tr>
	<td colspan="3" height="200" valign="top"><pre>${boardDTO.content }</pre></td>
</tr>
</table>
<input type="button" value="목록" 
onclick="location.href='/SpringProject/board/boardList.do?pg=${pg}'">
<input type="button" value="답글" 
onclick="location.href='/SpringProject/board/boardReplyForm.do?pseq=${boardDTO.seq }&pg=${pg}'">

<c:if test="${memId==boardDTO.id }">
<input type="button" value="글수정">
<input type="button" value="글삭제"
onclick="location.href='boardDelete.do?seq=${boardDTO.seq }'">
</c:if>
</body>
</html>













