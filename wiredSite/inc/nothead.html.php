 <?php
if (session_status() == PHP_SESSION_NONE) {
    session_start();
}
    require dirname(dirname(__FILE__))."/lib/db.lib.php";
try {
    $clientrq = $db->query("SELECT idrequest,id_user FROM request where idclient = ".$_SESSION['id']." ORDER BY idrequest DESC")->fetchall();
} catch (Exception $e) {
    exit($e);
}
$cntm =0;
$cntf =0;
  foreach ($clientrq as $rqid): 
$idrq = $rqid['idrequest'];
$cntmsg = $db->query("SELECT idreport FROM report where idrequest = ".$idrq." AND sclient=0")->fetchall();
foreach ($cntmsg as $getnb):
$cntm++;
endforeach;
endforeach;

$cntnotf = $db->query("SELECT id FROM notefs where idclient = ".$_SESSION['id']." AND seen=0")->fetchall();
foreach ($cntnotf as $getnb):
$cntf++;
endforeach;

if(isset($_POST['ntz']))
$updnotf = $db->query("UPDATE notefs SET seen=1 where idclient = ".$_SESSION['id']);
   
?>
        <!-- For msg -->

                    <i id="ig">
                        <i  style="color:#D1F1EE" id="fanb" class="fanb" value="<?php if($cntm > 0 ) echo $cntm; ?>"><?php if($cntm > 0 ) echo $cntm; ?></i> <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </i> 
                    <i id="in">
                        <i  style="color:#D1F1EE" id="fanb" class="fanb"><?php if($cntf > 0 ) echo $cntf; ?></i>  
                        <i class="fa fa-bell fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </i>
                        <!-- /.dropdown-messages -->
              
                <!-- /.dropdown -->
                
                    <!-- /.dropdown-tasks -->
              
                <!-- /.dropdown -->
            