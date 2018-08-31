

$(document).ready(function(){
	//로그인화면
	$('#logBtn').click(function(){
		$('#uidDiv').empty();
		$('#uPsDiv').empty();
		
		
		if($('#jid').val()=='')
			$('#uidDiv').text('아이디를 입력하세요').css('color','red').css('font-size','9pt' ,'bold');
		else if($('#jps').val()=='')
			$('#uPsDiv').text('비밀번호를 입력하세요').css('color','red').css('font-size','9pt');
	

	});
});