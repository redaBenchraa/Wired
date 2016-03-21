<?php
if (session_status() == PHP_SESSION_NONE) {
    session_start();
}


require dirname(dirname(__FILE__))."/lib/db.lib.php";
if(isset($_POST['mStsRq']))
    $lmt = $_POST['mStsRq'];
else 
    $lmt = 5;
$lstid = null;
$sql = $db->query("SELECT * FROM request WHERE idclient= ".$_SESSION['id']." Order By idrequest DESC LIMIT $lmt ")->fetchAll();

function setNotefs($sts,$date,$vnrq,$idrq){
    global $db;
$ntfs = $db->query("SELECT * FROM notefs WHERE idclient =".$_SESSION['id'])->fetchAll();
$alrd = null;
foreach ($ntfs as  $getntfs) {
   if($getntfs['subject'] == $sts && $getntfs['idrequest'] == $idrq){
        $alrd = 1;
        break;
   }
    else
        $alrd = 0;
}
if($alrd == 0)
$notefs = $db->query("INSERT INTO notefs SET subject = '$sts' , date='$date', type='$vnrq',idrequest=$idrq, idclient =".$_SESSION['id']);
global $lastid;
if($db->lastInsertId() != 0){
$lastid = $db->lastInsertId();

$stsntfs = $db->query("SELECT subject,idrequest,id FROM notefs WHERE idclient = ".$_SESSION['id']." AND id = ".$lastid)->fetch();
$_SESSION['cnntf'] += 1;
?>
<div id="ntf" >
<a id="myRqNt" href="<?= $stsntfs['subject'].",".$stsntfs['idrequest'].",".$stsntfs['id'] ?>" >
        <div class="alert alert-<?= $vnrq ?>">
    <span id="closentf" class="close">X</span>
        Your Request is <?=$stsntfs["subject"]; ?>! 
<audio src="sound/sound.mp3" autoplay  preload="auto"></audio>

        </div>
</a>         
</div>
<?php
}
}

?>
            <?php
            $date = date("Y-m-d");
            $vnrq = null;
            $typerq = null;
            $prs = null;
            $sts = null;
             foreach ($sql as $myrq):
                $idrq = $myrq['IDREQUEST'];
                if($myrq['ID_TYPE'] == 2 ) $typerq = "Transfer";
                if($myrq['ID_TYPE'] == 3 ) $typerq = "Maintenance";
                if($myrq['vboss'] == 0 ){
                 $vnrq = "warning";
                 $prs = 10;
                 $sts = "Not Yet";
                 $stspgs = "progress-striped";
                 
                }
                if($myrq['vboss'] == 1 ){
                 $vnrq = "info";
                 $prs = 20;
                 $sts = "Accepted";
                 $stspgs = "progress-striped";
                 setNotefs($sts,$date,$vnrq,$idrq);
                }
                 if($myrq['vboss'] == 2){
                 $vnrq = "danger";
                 $prs = 100;
                 $sts = "Rejected";
                 $stspgs = "";
                 setNotefs($sts,$date,$vnrq,$idrq);
                }
                if($myrq['SEEN'] == 2 ){
                 $vnrq = "success";
                 $prs = 50;
                 $sts = "In progress ...";
                 $stspgs = "progress-striped";
                 setNotefs($sts,$date,$vnrq,$idrq);
                }
                if($myrq['ERROR'] == 2 ){
                    $vnrq = "danger";
                    $prs = 100;
                 $sts = "Error";
                 $stspgs = "";
                 setNotefs($sts,$date,$vnrq,$idrq);
                }
                if($myrq['FINISHED'] == 2 ){
                 $vnrq = "success";
                    $prs = 100;
                 $sts = "Finished With success";
                 $stspgs = "";
                 setNotefs($sts,$date,$vnrq,$idrq);
                 
                }
             endforeach;
             ?>