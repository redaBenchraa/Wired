<?php
   session_start();
   if(!isset($_SESSION['id']))
	header("location:login.php");
   require dirname(dirname(__FILE__))."/lib/db.lib.php";
$sql = $db->query("SELECT * FROM request ORDER BY idrequest DESC LIMIT 1 ")->fetch();
	if($sql)
		$lastid = $sql['IDREQUEST'];
	if(isset($_GET['sendreq']) && $_GET['sendreq'] == "send"){
		if(isset($_POST) && !empty($_POST)){
			$client = $db->query("SELECT * FROM client WHERE id = ".$_SESSION['id'])->fetch();
			extract($_POST);
			$typerq = null;
			$typel = null;
			if($grp1 == "transfer")
				$typerq = 2;
			if($grp1 == "maintenance")
				$typerq = 3;
			if($typerq == 3){
			if(count($typeline) == 2)
				$typel = $typeline[0]." and ".$typeline[1];
			else
				$typel = $typeline[0];
			}else{
				$typel = $client['service'];
			}
			
			//$lsid = $db->lastinsertid();
			$date = date("Y-m-d");
			try {
				$nrqid = $lastid + 1;
				$sql = $db->query("INSERT INTO request SET SENDDATE='$date' ,idrequest=$nrqid, id_type=$typerq, net='$typel', idclient='".$_SESSION['id']."',clientname='".$client['fullName']."',telclient='".$client['phone']."',address1='".$client['address']."',address2='$nadd',problem='$problem'");
				if($sql) header("location: ../index.php");
				var_dump($sql);
			} catch (Exception $e) {
				exit($e);
			}			
		}
	}

if(isset($_GET['sendreq']) && $_GET['sendreq'] == "update"){
		if(isset($_POST['password']) && !empty($_POST['password'])){
			extract($_POST);
			try {
				$sql = $db->query("UPDATE client SET password='$password' WHERE id = ".$_SESSION['id']);
				if($sql){
					echo "<div class='alert alert-success'> UPDATEd </div> ";
					header("location: ../index.php");
				}
			} catch (Exception $e) {
				exit($e);
			}			
		
		}else{
			echo "<div class='alert alert-success'> Error </div> ";
			header("location: ../index.php");
		}
	}
?>