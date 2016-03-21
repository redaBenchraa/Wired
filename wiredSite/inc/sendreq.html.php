
<?php
if(session_status() == PHP_SESSION_NONE)
	session_start();
if(!isset($_SESSION['id']))
	exit (" You Have Not Access To this page ");
$_SESSION['lmt'] = 5;
require dirname(dirname(__FILE__)).'/lib/db.lib.php';
$finish = $db->query("SELECT ERROR,FINISHED,vboss FROM request WHERE idclient= ".$_SESSION['id']." Order By idrequest DESC  ")->fetch();
if(!$finish || ($finish['FINISHED'] == 2 || $finish ['ERROR'] == 2 || $finish ['vboss'] == 2 )):
	
?>

<div id="sendreq">
    <div class="col-lg-8">
  <div class="panel panel-warning">
     <div class="panel-heading">
            <i class="fa fa-pencil fa-fw"></i> Send a new Request
      </div>
      <div class="panel-body">
	<form role="form" action="lib/rqdb.lib.php?sendreq=send" method="post">
		<div class="form-group">
	
			<label>What do you want :</label>
			<label   class="radio-inline">
			    <input name="grp1" value="transfer" checked="" type="radio">Transfer
			</label>
			<label class="radio-inline">
			    <input name="grp1" value="maintenance" type="radio">Maintenance
			</label>
        </div>
<script type="text/javascript">
	$(function(){
		var isChecked = null;
		$("input[type=radio]").on("click",function(){
		 isChecked = $("input:checked").val();
			if(isChecked == "transfer"){
			$("input[name=nadd]").fadeIn();
			$("textarea[name=problem]").fadeOut();
			$("input[name='typeline[]']").prop('disabled', true);

			}
			else{
			$("input[name=nadd]").fadeOut();
			$("textarea[name=problem]").fadeIn();
			$("input[name='typeline[]']").prop('disabled', false);
			}

			
		});


	});
	</script>
	<br />
<?php
	try{
			$sql = $db->query("SELECT * FROM client WHERE id = ".$_SESSION['id'])->fetch();
			$phonechek = "";
			$adslchek = "";
		
		if(strcasecmp($sql['service'],"adsl") == 0){
				$adslchek = "checked";
				
			} 
			if(strcasecmp($sql['service'],"phone line") == 0){
			$phonechek = "checked";
		

			} 
			if(strcasecmp($sql['service'],"phone line and adsl") == 0){
				$phonechek = "checked";
				$adslchek = "checked";
			
			}
		
	}catch(PDOexception $e){
			exit($e);
		}

?>
	<ul class="list-group">
  <li class="list-group-item list-group-item-warning">Full Name : <?=$sql['fullName']?></li>
  <li class="list-group-item ">Phone : <?=$sql['phone']?></li>
  <li class="list-group-item list-group-item-warning">Address : <?=$sql['address']?></li>

</ul>
		<div class="form-group">
            <label>Services : </label>
            <div class="checkbox">
                <label>
                    <input  <?= $adslchek  ?>  disabled name="typeline[]" value="adsl" type="checkbox"> Adsl
                </label>
         
                <label>
                    <input <?= $phonechek ?>  disabled name="typeline[]" value="phone line" type="checkbox">Phone Line
                </label>
            </div>                            
    	</div>
		<input class="form-control" type="text" placeholder="New Adress ..." name="nadd"><br />
		<textarea  class="form-control" name="problem" Placeholder="Your Problem here ..."></textarea><br />
		<button  class="btn btn-primary" id="send">Send</button>
	</form>
</div>
                                       
      </div>                              
</div>
</div>

<?php 
else:
	$dsbld = "disabled";
?>
<div id="sendreq">
    <div class="col-lg-8">
	<div class='alert alert-warning'><strong>You have already requested,<br />
please wait for finish Your first request</strong></div>
</div>
</div>

<?php
endif;
?>

<style type="text/css">
	#sendreq{
				text-align: center;
	}
	#sendreq .list-group{
		text-align: justify;
	}
</style>