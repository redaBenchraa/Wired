$(document).ready(function(){
	$('#btn-user-setting').on('click',function(){
		var FName = $('#btn-user-setting').attr('name');
		var FormName = '#'+FName;
			$(FormName).submit();
		return false;
	});
	$('#uploadImg').on('click',function(){
		/*
				$("#SubmitPic").submit();
				return false;
			});*/

		});

});
