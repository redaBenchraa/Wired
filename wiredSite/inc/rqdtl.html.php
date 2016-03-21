<style type="text/css">
	label{
		display:inline-block;
		text-align: right;
		margin-right: 100px;
	}
</style>
         <div id="RqstDtl">
                <div class="col-lg-8">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <i class="fa fa-bar-chart-o fa-fw"></i> Request 
                              <a style="color:#fff" id="allntfs" class="pull-right" href="#">
                                <i class="fa fa-angle-left"></i>
                                <strong>Return to Alerts</strong>
                            </a>

                        </div>
 
                        <!-- /.panel-heading -->
                        <div class="panel-body" style="font-size:15px; margin-left:100px;">
                        <?php

if (session_status() == PHP_SESSION_NONE) {
    session_start();
}
    require dirname(dirname(__FILE__))."/lib/db.lib.php";
                        $idrq = $_POST['idrq'];
	$rqdtl = $db->query("SELECT * FROM request WHERE IDREQUEST=$idrq and idclient = ".$_SESSION['id'])->fetch();
			$reply = false;
			if($rqdtl['ID_TYPE'] == 2 ){
				$rqtp = "Transfer";
				$trdtl = "<strong> Address: </strong> <em>".$rqdtl['ADDRESS1']."</em><br />";
				$trdtl .="<strong> Transfer Address : </strong> <em>".$rqdtl['ADDRESS2']."</em> <br />";
			} 
			if($rqdtl['ID_TYPE'] == 3){
			 $rqtp = "Maintenance";
			 $trdtl = "	<strong> Problem: </strong> <blockquote>".$rqdtl['problem']."</blockquote><br />";
			}
			if($rqdtl['ID_TYPE'] == 1){
			 $rqtp = "Installation";
			 $trdtl = "";
			}
                if($rqdtl['vboss'] == 1 ){
                 $vnrq = "info";
                 $sts = "Accepted";
                }
                 if($rqdtl['vboss'] == 2){
                 $vnrq = "danger";
                 $sts = "Rejected";
                 $reply = true;
                }
                if($rqdtl['SEEN'] == 2 ){
                 $vnrq = "success";
                 $sts = "In progress ...";
                }
                if($rqdtl['ERROR'] == 2 ){
                    $vnrq = "danger";
                 $sts = "Error";
                 $reply = true;
                }
                if($rqdtl['FINISHED'] == 2 ){
                 $vnrq = "success";
                 $sts = "Finished With success";
                 $reply = true;
                }

               if($reply){
               	$mreply = "Yes";
               }else{
               	$mreply = "Not yet";
               }
                        ?>
	    	<strong> Service  : </strong> <label><?= $rqdtl['Net'];?> </label> <br />
			<strong> Request Type : </strong> <label><?= $rqtp ?> </label><br />
			<?= $trdtl; ?>
			<strong> Status : </strong> <label><?=$sts?></label> <br />
			<strong> Date : </strong> <label> <?=$rqdtl['SENDDATE'];?> </label><br />
			<strong> Reply : </strong> <label><?=$mreply;?></label> <br />
             
                                               </div>
                     </div>
                  </div>
           </div>
