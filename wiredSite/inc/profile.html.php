<?php
if(session_status() == PHP_SESSION_NONE)
	session_start();
if(!isset($_SESSION['id']))
	exit (" You Have Not Access To this page ");
$_SESSION['lmt'] = 5;
require dirname(dirname(__FILE__)).'/lib/db.lib.php';
$client = $db->query("SELECT * FROM client WHERE id = ".$_SESSION['id'])->fetch();


?>
<style type="text/css">
	#profile{
				
				text-align: center;
				  
	}
	#profile .list-group{
		text-align: justify;
	}
</style>
<script type="text/javascript">
	$(function(){
		$(".reveal").mousedown(function() {
    $(".pwd").replaceWith($('.pwd').clone().attr('type', 'text'));
})
.mouseup(function() {
	$(".pwd").replaceWith($('.pwd').clone().attr('type', 'password'));
})
.mouseout(function() {
	$(".pwd").replaceWith($('.pwd').clone().attr('type', 'password'));
});
	})
</script>
<div id="profile">
    <div class="col-lg-8">
    <div class="panel panel-danger">
     <div class="panel-heading">
        <i class="fa fa-user fa-fw"></i> Manager Your Account
    </div>
      <div class="panel-body">
	<form role="form" action="lib/rqdb.lib.php?sendreq=update" method="post">
			
			<div class='alert alert-info'><strong> You Can Only Change Your Password,<br />
				To Change your information or add more services, Please contact our agency. </strong></div>
	<br />
	<label> Welcome , <?= $_SESSION['fullname']; ?></label>
	<ul class="list-group">
  <li class="list-group-item list-group-item-success">Services  : <?= $client['service'] ?>  </li>
  <li class="list-group-item ">Full Name : <?=$client['fullName']?></li>
  <li class="list-group-item list-group-item-success">Phone : <?=$client['phone']?></li>
  <li class="list-group-item ">Address : <?=$client['address']?></li>

</ul>

		   <div class="input-group">
          <input type="password" class="form-control pwd" name="password" value="<?= $client['password']?>">
          <span class="input-group-btn">
            <button class="btn btn-default reveal" type="button"><i class="glyphicon glyphicon-eye-open"></i></button>
          </span>          
        </div> <br />

		<button class="btn btn-primary" id="send">Update</button>
	</form>
</div>
                                       
                                    
</div>
</div>
</div>
