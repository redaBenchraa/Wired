

<?php
    require dirname(dirname(__FILE__))."/lib/db.lib.php";
$_SESSION['lmt'] = 5;
    if(isset($_POST['idmsg'])){
$idmsg = $_POST['idmsg'];
$cnd = "where IDREPORT = ".$idmsg;
$sql = $db->query("UPDATE report SET sclient = 1 WHERE IDREPORT = $idmsg");
}else{
    $cnd = "";
}
    $msgrd = $db->query("SELECT idSender,IDREQUEST,IDREPORT, REPORT , REPORTDATE FROM report ".$cnd."  ORDER BY idrequest DESC ")->fetch();
    $idrq = $msgrd['IDREQUEST'];
    $user = $db->query("SELECT name,lastname FROM user where id_user = ".$msgrd['idSender'])->fetch();
    $rqrd = $db->query("SELECT * FROM request WHERE idrequest = $idrq")->fetch();
            if($rqrd['ID_TYPE'] == 1 ) $rq = "Installation";
            if($rqrd['ID_TYPE'] == 2 ) $rq = "Transfer";
            if($rqrd['ID_TYPE'] == 3) $rq = "Maintenance";
            if($rqrd['FINISHED'] == 2) $sts= '<span style="color:#5CB85C">Finished With success </span>';
            if($rqrd['ERROR'] == 2) $sts= "<span style='color:#DE6C69'>Error </span>";
            if($rqrd['vboss'] == 2) $sts= "<span style='color:#DE6C69'>Rejected </span>";
?>
<div id="tst">
<blockquote >
         <em class='pull-right'><?= $msgrd['REPORTDATE'] ?></em>
        <strong> From : <?= $user['name']." ".$user['lastname'] ?><br /> </strong>
        <strong> Service  : <?= $rqrd['Net'];?> </strong> <br />
        <strong> Request : <?= $rq ?> </strong><br />
        <strong> Status : <?=$sts?></strong> <br />
        <strong> Messager :</strong>
        <blockquote><?=$msgrd['REPORT']; ?></blockquote><br />
</blockquote>
</div>