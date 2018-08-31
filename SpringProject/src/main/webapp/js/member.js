$(document).ready(function(){
	//회원가입
	$('#writeBtn').click(function(){
		$('#nameDiv').empty();
		$('#IDDiv').empty();
		$('#PWDDiv').empty();
		$('#repwdDiv').empty();
		
		if($('#name').val()=='')
			$('#nameDiv').text('이름을 입력하세요').css('color','red').css('font-size','9pt');
		else if($('#ID').val()=='')
			$('#IDDiv').text('아이디를 입력하세요').css('color','red').css('font-size','9pt');
		else if($('#PWD').val()=='')
			$('#PWDDiv').text('비밀번호를 입력하세요').css('color','red').css('font-size','9pt');
		else if($('#PWD').val()!=$('#repwd').val())
			$('#repwdDiv').text('비밀번호가 맞지 않습니다').css('color','red').css('font-size','9pt');
		else if($('#ID').val()!=$('#check').val()) 
			$('#IDDiv').text('중복체크 하세요').css('color','magenta').css('font-size','9pt');
		else
			$('#writeForm').submit();
	});
	
	//중복체크
	$('#checkId').click(function(){
		var sId = $('#ID').val();
		$('#IDDiv').empty();
		
		if(sId == "")
			$('#IDDiv').text('먼저 아이디 입력하세요').css('color','magenta').css('font-size','9pt');
		else
			$.ajax({
				type : 'POST',
				url : '/SpringProject/member/checkId.do',
				data : {'id':sId},
				dataType : 'text',
				success : function(data) {
					if(data=='exist')
						$('#IDDiv').text('사용 불가능').css('color','magenta').css('font-size','9pt');
					
					else if(data=='not_exist'){
						$('#IDDiv').text('사용 가능').css('color','magenta').css('font-size','9pt');
						$('#check').val(sId);
					}
				}
			});
	});
	
	//우편번호
	$('#checkPost').click(function(){
		window.open("/SpringProject/member/checkPost.do","","width=400 height=400 location=yes scrollbars=yes");
	});
	
	$('#postSearchBtn').click(function(){
		if($('#sigungu').val()=="" && $('#roadname').val()=="")
			alert("주소를 입력해주세요");
		else {
			$.ajax({
				type : 'POST',
				url : '/SpringProject/member/postSearch.do',
				data : {"sido" : $('#sido').val(),
				    	"sigungu" : $('#sigungu').val(),
				    	"roadname" : $('#roadname').val()},
				dataType : 'json',
				success : function(data){
					//alert(JSON.stringify(data));
					/*
					{list : [{zipcode:23578, sido:서울,...},
							 {zipcode:07585, sido:서울,...}},
							 ...
							]
					}
					*/
					
					$('table tr:gt(2)').remove();
					$.each(data.list, function(index, item){
						var address = item.sido+" "
									+ item.sigungu+" "
									+ item.yubmyundong+" "
									+ item.ri+" "
									+ item.roadname+" "
									+ item.buildingname;
						
						address = address.replace(/null/g, "");
						
						$('<tr/>').append($('<td/>',{
							align : 'center',
							text : item.zipcode
						})).append($('<td/>',{
							colspan : '3',
							}).append($('<a/>',{
								href : 'javascript:void(0)',
								//onclick : "checkPostClose('"+item.zipcode+"','"+address+"')",
								id : 'addressA',
								text : address
							}))
						).appendTo($('#postTable'));
						
						});
					$('#postTable').on('click','a',function(){//a태그내에서 클릭이벤트를 발생한것을 비동기 처리한다.
						//alert($(this).parent().prop('tagName'));
						//$('[name=zipcode]',opener.document).val($(this).parent().prev().text());
						$('#zipcode',opener.document).						
						val($(this).parent().parent().find('td').eq(0).text());//this는  이벤트가 일어난a태그에서의 값  ex서울 종로구rk a태그다
						//val($(this).parent().prev().text());
						$('#addr1',opener.document).val($(this).text());
						$('#addr2',opener.document).focus();
						window.close();
						
						/*alert($(this).before('짱짱맨').text());*/
					});
				}
			});
		}
	});
});



















