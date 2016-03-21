<?php
if (session_status() == PHP_SESSION_NONE) {
    session_start();
}
    require dirname(dirname(__FILE__))."/lib/db.lib.php";
$_SESSION['lmt'] = 5;

if(isset($_POST['idmsg'])){
$idmsg = $_POST['idmsg'];
$cnd = "where IDREPORT = ".$idmsg;
$sql = $db->query("UPDATE report SET sclient = 1 WHERE IDREPORT = $idmsg");
}else{
	$cnd = "";
}
try {
            $clientrq = $db->query("SELECT idrequest,id_user FROM request where idclient = ".$_SESSION['id']." ORDER BY idrequest DESC")->fetchall();
			$lstrq = $db->query("SELECT idrequest,id_user FROM request where (FINISHED=2 or ERROR=2 or vboss = 2 ) and idclient = ".$_SESSION['id']." ORDER BY idrequest DESC")->fetch();
			$msgrd = $db->query("SELECT sclient,idSender,IDREQUEST,IDREPORT, REPORT , REPORTDATE FROM report WHERE IDREQUEST= ".$lstrq['idrequest'])->fetch();
            $idus = $msgrd['idSender'];
            //var_dump($lstrq);
            //die();
            $nuser = $db->query("SELECT name,lastname FROM user where id_user = ".$idus)->fetch();
            $idrq = $msgrd['IDREQUEST'];
			$rqrd = $db->query("SELECT * FROM request WHERE idrequest = $idrq")->fetch();
            if($rqrd['ID_TYPE'] == 1 ) $rq = "Installation";
			if($rqrd['ID_TYPE'] == 2 ) $rq = "Transfer";
			if($rqrd['ID_TYPE'] == 3) $rq = "Maintenance";
			if($rqrd['FINISHED'] == 2) $sts= '<span style="color:#5CB85C">Finished With success </span>';
            if($rqrd['vboss'] == 2) $sts= "<span style='color:#DE6C69'>Rejected </span>";
            if($rqrd['ERROR'] == 2) $sts= "<span style='color:#DE6C69'>Error </span>";
		} catch (Exception $e) {
			die($e);
		}

?>

<style type="text/css">

	#rmsg,#rmsg2{
   		max-height: 500px;
   	 	overflow: auto;

    } 
    #rmsg{
    	width: 280px;
    }
   .jspVerticalBar {
    width: 8px;
    background: transparent;
    right:10px;
}
.jspVerticalBar:hover {
    width: 12px;
}
 
.jspHorizontalBar {
    bottom: 5px;
    width: 100%;
    height: 8px;
    background: transparent;
}
.jspTrack {
    background: transparent;
}
 
.jspDrag {
    background: url(img/transparent-black.png) repeat;
    -webkit-border-radius:4px;
    -moz-border-radius:4px;
    border-radius:4px;
}
 
.jspHorizontalBar .jspTrack,
.jspHorizontalBar .jspDrag {
    float: left;
    height: 100%;
}
 
.jspCorner {
    display:none
}
</style>
<script type="text/javascript">
$(document).ready(function(){
  $('#rmsg').jScrollPane({
    horizontalGutter:5,
    verticalGutter:5,
    'showArrows': false
});
 $('#rmsg2').jScrollPane({
    horizontalGutter:5,
    verticalGutter:5,
    'showArrows': false

});

  $("#rmsg2").mouseenter(function(){
  	$('#tst').css({"max-height": "500px","overflow": "auto"});
  $("#tst").jScrollPane({
    horizontalGutter:5,
    verticalGutter:5,
    'showArrows': false
});
  });
 $('.jspDrag').hide();
$(document).on('mouseenter','.jspScrollable',function(){
    $(this).find('.jspDrag').stop(true, true).fadeIn('slow');

});
$(document).on('mouseleave','.jspScrollable',function(){
    $(this).find('.jspDrag').stop(true, true).fadeOut('slow');

});
});
</script>
<div class="col-lg-8">
<div class="panel panel-default">
    <div class="panel-heading">
        <i class="fa  fa-envelope fa-fw"></i> <b>Messages </b>
                    
     </div>
    <!-- /.panel-heading -->
    <div style="cursor: text;" class="panel-body">
        	<div class="row">
    		<div class="col-lg-4 col-md-4 col-sm-4 col-xs-3">
    			<ul  class="read-messages">
    		<div id="rmsg">
    			<?php
    			        foreach ($clientrq as $rqid):
                    	$idrq = $rqid['idrequest'];
						$msgrp = $db->query("SELECT sclient,idSender,IDREPORT,REPORT , REPORTDATE FROM report where idrequest = ".$idrq."")->fetchall();
                        $cmsg = count($msgrp);
                       // $tmsg = count($msgrp) + $tmsg;
                         ?>
                         <?php foreach ($msgrp as $getmsg): 
                if($getmsg['sclient'] == 0 ) $nmsgc = "class='noReadMsg'";
                           
                            else $nmsgc = "";
                             $idus = $getmsg['idSender'];
            $suser = $db->query("SELECT name,lastname FROM user where id_user = ".$idus)->fetch();
                         ?>
                    	 	<li id="ttmsg" <?= $nmsgc; ?>>
    <a id="readmsg2" href="?msg=<?=$getmsg['IDREPORT'].'='.$suser['name'].' '.$suser['lastname'];?>">
                                <div>
                                    <strong><?=$suser['name']."   ".$suser['lastname'];?> </strong>
                                   
                                </div>
                                    <div><?php 
                                         echo substr($getmsg['REPORT'],0,20);
                                         if(strlen($getmsg['REPORT']) > 20)
                                          echo "..."; ?></div>
                            </a>
                        </li>
                        
                        <li class="divider"> </li>
                    	 <?php endforeach ?>
                    	
    <?php endforeach ;?>


    	</div>

    			</ul>
    		</div>
<div  class="col-lg-8 col-md-8 col-sm-8 col-xs-8">

<div id='rmsg2' >
	<blockquote >
                <em class='pull-right'><?= $msgrd['REPORTDATE'] ?></em>
            <strong> From : <?= $nuser['name']." ".$nuser['lastname'] ?><br /> </strong>
	    	<strong> Service  : <?= $rqrd['Net'];?> </strong> <br />
			<strong> Request : <?= $rq ?> </strong><br />
			<strong> Status : <?=$sts?></strong> <br />
			<strong> Messager :</strong><blockquote><?=$msgrd['REPORT']; ?></blockquote><br />
	</blockquote>

</div>
</div>
	</div>
	</div>
    <!-- /.panel-body -->
</div>
<!-- /.panel -->
</div> 
