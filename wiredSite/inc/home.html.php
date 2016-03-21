<?php
if (session_status() == PHP_SESSION_NONE) {
    session_start();
}
if (isset($_SESSION['lastid']))
    $_SESSION['lastid'];


require dirname(dirname(__FILE__))."/lib/db.lib.php";
if(isset($_POST['mStsRq']))
    $_SESSION['lmt'] = $_POST['mStsRq'];
else{
    if($_SESSION['lmt'] > 5)
    $_SESSION['lmt'] = $_SESSION['lmt'] ;
} 

$lstid = null;
$sql = $db->query("SELECT * FROM request WHERE idclient= ".$_SESSION['id']." Order By idrequest DESC LIMIT ".$_SESSION['lmt'])->fetchAll();
?>
            
            <!-- For Follow The Request Status -->
            <div id="home">
                <div class="col-lg-8">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <i class="fa fa-bar-chart-o fa-fw"></i> Request Status
                        </div>
 
                        <!-- /.panel-heading -->
                        <div id="hmreq" class="panel-body">
        
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
                 $prs = 20;
                 $sts = "Not Yet";
                 $stspgs = "active";
                 //$_SESSION['finished'] = 0;
                }
                if($myrq['vboss'] == 1 ){
                 $vnrq = "info";
                 $prs = 50;
                 $sts = "Accepted";
                 $stspgs = "active";
                 //setNotefs($sts,$date,$vnrq,$idrq);
                }
                 if($myrq['vboss'] == 2){
                 $vnrq = "danger";
                 $prs = 100;
                 $sts = "Rejected";
                 $stspgs = "";
                 //setNotefs($sts,$date,$vnrq,$idrq);
                }
                if($myrq['SEEN'] == 2 ){
                 $vnrq = "success";
                 $prs = 80;
                 $sts = "In progress ...";
                 $stspgs = "active";
                 //setNotefs($sts,$date,$vnrq,$idrq);
                }
                if($myrq['ERROR'] == 2 ){
                    $vnrq = "danger";
                    $prs = 100;
                 $sts = "Error";
                 $stspgs = "";
                 //setNotefs($sts,$date,$vnrq,$idrq);
                }
                if($myrq['FINISHED'] == 2 ){
                 $vnrq = "success";
                    $prs = 100;
                 $sts = "Finished With success";
                 $stspgs = "";
                 //setNotefs($sts,$date,$vnrq,$idrq);
                // $_SESSION['finished'] == 1;
                }
             ?>
                           
                                <div id="vdrq" value="<?= $sts; ?>">
                                    <p>
                                        <strong> <?=$typerq?> Request <?= $myrq['SENDDATE'];?> : <?=  $sts ?></strong>
                                        <span class="pull-right text-muted"></span>
                                   
                                    </p>
                                    <div class="progress progress-striped <?= $stspgs ?>">
                                        <div class="progress-bar progress-bar-<?=  $vnrq; ?>" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: <?=$prs?>%">
                                            <span class="sr-only"></span>
                                        </div>
                                    </div>
                                </div>
                         <?php endforeach ?>

                            <center><a href="#" id="mStsRq" class="btn btn-info"> See More </a></center>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
           
                   
                </div>
                <!-- End Follow-->
    </div>

               