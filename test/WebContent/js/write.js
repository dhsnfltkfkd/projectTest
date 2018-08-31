
$(document).ready(function(){
	//회원가입
	$('#createBtn').click(function(){
		$('#checkNameDiv').empty();
		$('#checkIdDiv').empty();
		$('#checkPsDiv').empty();
		$('#checkRpsDiv').empty();
		
		if($('#uname').val()=='')
			$('#checkNameDiv').text('이름을 입력하세요').css('color','red').css('font-size','9pt');
		else if($('#uid').val()=='')
			$('#checkIdDiv').text('아이디를 입력하세요').css('color','red').css('font-size','9pt');
		else if($('#ps').val()=='')
			$('#checkPsDiv').text('비밀번호를 입력하세요').css('color','red').css('font-size','9pt');
		else if($('#ps').val()!=$('#rps').val())
			$('#checkRpsDiv').text('비밀번호가 맞지 않습니다').css('color','red').css('font-size','9pt');
		else
			$('#writeForm').submit();
	});
});
	