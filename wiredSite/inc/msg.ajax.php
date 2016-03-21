 <?php
if (session_status() == PHP_SESSION_NONE) {
    session_start();
}
    require dirname(dirname(__FILE__))."/lib/db.lib.php";
try {
    $clientrq = $db->query("SELECT idrequest FROM request where idclient = ".$_SESSION['id']." ORDER BY idrequest DESC ")->fetchall();
} catch (Exception $e) {
    exit($e);
}
    $tmsg = 0;
foreach ($clientrq as $rqid):
    $idrq = $rqid['idrequest'];
    $msgrp = $db->query("SELECT sclient,idSender,IDREPORT, REPORT , REPORTDATE FROM report where idrequest = ".$idrq)->fetchall();
    $cmsg = count($msgrp);
    $tmsg = count($msgrp) + $tmsg;
    
 ?>
 <?php foreach ($msgrp as $getmsg): 

 if($tmsg > 5) break;
 if($getmsg['sclient'] == 0 ) $nmsgc = "class='noReadMsg'";
    else $nmsgc = "";
$idus = $getmsg['idSender'];
$nuser = $db->query("SELECT name,lastname FROM user where id_user = ".$idus)->fetch();;
 ?>
    <li <?= $nmsgc ;?> >

    <a id="readmsg" href="?msg=<?=$getmsg['IDREPORT'].'='.$nuser['name'].' '.$nuser['lastname'];?>">
        <div>
            <strong><?=$nuser['name']."   ".$nuser['lastname'];?> </strong>
            <span class="pull-right text-muted">
                <em><?= substr($getmsg['REPORTDATE'],0,10)?></em>
            </span>
        </div>
        <div><?php 
         echo substr($getmsg['REPORT'],0,30);
         if(strlen($getmsg['REPORT']) > 40)
          echo "..."; ?></div>
    </a>
</li>

<li class="divider"> </li>
 <?php endforeach;?>

<?php endforeach ;
    if($tmsg == 0):
?>
  <li>
    <a class="text-center" href="#">
        <strong>You don't have new Message</strong>
        <i class="fa fa-angle-right"></i>
    </a>
</li> 
<li class="divider"> </li> 
<?php
    endif;
 ?>

<li>
    <a class="text-center" id="allmsg" href="#">
        <strong>See All Messages(<?=$tmsg?>)</strong>
        <i class="fa fa-angle-right"></i>
    </a>
</li>
