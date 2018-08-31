<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table id="table" border="1">
<tr>
	<th width="100">이름</th>
	<th width="100">아이디</th>
	<th width="100">비밀번호</th>
</tr>
</table>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$.ajax({
		type : "POST",
		url : "/chapter06_DynamicSpringMaven/user/getUserList.do",
		dataType : "json",
		success : function(data){
			/*
			{"list":[{"name":"홍길동","id":"hong","pwd":"111"},
         			 {"name":"코난","id":"conan","pwd":"111"},
					]
			}
			*/
			//alert(JSON.stringify(data));
			
			$.each(data.list, function(index, items){
				$('<tr/>').append($('<td/>',{
					align : 'center',
					text : items.name
				})).append($('<td/>',{
					align : 'center',
					text : items.id
				})).append($('<td/>',{
					align : 'center',
					text : items.pwd
				})).appendTo($('#table'));
			});
		}
	});
});
</script>
</body>
</html>















