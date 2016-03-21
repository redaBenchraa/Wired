
<style type="text/css">

	.status{
		font-weight: bold;
		font-size: 15px;
	}
</style>
<?php
if (session_status() == PHP_SESSION_NONE) {
    session_start();
}
// Condation for Session
if(!isset($_SESSION['id']))
	exit (" You Have Not Access To this page ");
$_SESSION['lmt'] = 5;
    require dirname(dirname(__FILE__))."/lib/db.lib.php";
// Requet SQL 
	$Tsql = $db->query("SELECT * FROM request WHERE ID_TYPE=2 and idclient = ".$_SESSION['id']." ORDER BY idrequest DESC")->fetchAll();
	$Msql = $db->query("SELECT * FROM request WHERE ID_TYPE=3 and idclient = ".$_SESSION['id']." ORDER BY idrequest DESC")->fetchAll();
	$Isql = $db->query("SELECT * FROM request WHERE ID_TYPE=1 and idclient = ".$_SESSION['id']." ORDER BY idrequest DESC")->fetchAll();
	$hrq = 1;
	if(!$Tsql && !$Msql && !$Isql){
		$hrq = 0;
		echo("<div class='col-lg-8'> <center><h2>You Don't Have a Request</h2></center> </div>");
	}
	if($hrq == 1):

	// Table For installation
?>

 <div id="following">
    <div class="col-lg-8">
      <div class="row">
            <!-- For Follow The Request Status -->
                <div class="col-lg-12">
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            <i class="fa fa-bar-chart-o fa-fw"></i> Installation
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">

                           	<table class="table table-striped table-bordered table-hover">
                                   <thead>
			<tr>
				<td>Service</td>
				<td>Adress</td>
				<td>Status</td>
			</tr>
		</thead>
<?php
	$typerq = null;
	$vnrq = null;
	$clr = null;

		//var_dump($sql);
		foreach ($Isql as $ifrq):
		// For Type de Request
	/*if($ifrq['ID_TYPE'] == 1 ) $typerq = "Installation";
	if($ifrq['ID_TYPE'] == 2 ) $typerq = "Transfer";
	if($ifrq['ID_TYPE'] == 3 ) $typerq = "Maintenance";*/
	// validation request
	if($ifrq['vboss'] == 0 ) {
		$vnrq = "<span class='status'> Not yet </span>";
		$clr = "#F2B968";
	}
	if($ifrq['vboss'] == 1 ){
	$vnrq = "<span class='status'>Accepted </span>";
	$clr = "#F0AD4E";
	} 
	if($ifrq['vboss'] == 2){
	$vnrq = "<span class='status'>rejected </span>";
	$clr = "#DE6C69";
	} 
	if($ifrq['SEEN'] == 2 ){
	 $vnrq = "<span class='status'>In progress </span>";
	 $clr = "#74C274";
	}
	if($ifrq['ERROR'] == 2 ) {
		$vnrq = "<span class='status'> Error </span>";
		$clr = "#DE6C69";
	}
	if($ifrq['FINISHED'] == 2 ){
		$vnrq = "<span class='status'>Finished With success </span>";
		$clr = "#5CB85C";
	}

?>

		<tbody>
			<tr>
				<td><?=$ifrq['Net']?></td>
				<td><?=$ifrq['ADDRESS1']?></td>
				<td  style="color: <?= $clr?>"><?=$vnrq;?></td>
			</tr>
		</tbody>

<?php

		endforeach;		
?>
                                </table>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
           
                   
                </div>
                <!-- End Follow-->
</div>
<?php if($Tsql):
// Transfer
 ?>
  <div class="row">
            <!-- For Follow The Request Status -->
                <div class="col-lg-12">
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            <i class="fa fa-bar-chart-o fa-fw"></i> Transfer
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">

                           	<table class="table table-striped table-bordered table-hover">
                                   <thead>
			<tr>
				<td>Service</td>
				<td>Adress</td>
				<td>New Adress</td>
				<td>Status</td>
			</tr>
		</thead>
<?php
	$typerq = null;
	$vnrq = null;
	$clr = null;

		//var_dump($sql);
		foreach ($Tsql as $ifrq):
		// For Type de Request
	/*if($ifrq['ID_TYPE'] == 1 ) $typerq = "Installation";
	if($ifrq['ID_TYPE'] == 2 ) $typerq = "Transfer";
	if($ifrq['ID_TYPE'] == 3 ) $typerq = "Maintenance";*/
	// validation request
	if($ifrq['vboss'] == 0 ) {
		$vnrq = "<span class='status'> Not yet </span>";
		$clr = "#F2B968";
	}
	if($ifrq['vboss'] == 1 ){
	$vnrq = "<span class='status'>Accepted </span>";
	$clr = "#F0AD4E";
	} 
	if($ifrq['vboss'] == 2){
	$vnrq = "<span class='status'>rejected </span>";
	$clr = "#DE6C69";
	} 
	if($ifrq['SEEN'] == 2 ){
	 $vnrq = "<span class='status'>In progress </span>";
	 $clr = "#74C274";
	}
	if($ifrq['ERROR'] == 2 ) {
		$vnrq = "<span class='status'> Error </span>";
		$clr = "#DE6C69";
	}
	if($ifrq['FINISHED'] == 2 ){
		$vnrq = "<span class='status'>Finished With success </span>";
		$clr = "#5CB85C";
	}

?>

		<tbody>
			<tr>
				<td><?=$ifrq['Net']?></td>
				<td><?=$ifrq['ADDRESS1']?></td>
				<td><?=$ifrq['ADDRESS2']?></td>
				<td  style="color: <?= $clr?>"><?=$vnrq;?></td>
			</tr>
		</tbody>

<?php

		endforeach;		
?>
                                </table>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
           
                   
                </div>
                <!-- End Follow-->
</div>
<?php endif; ?>
<!-- Table For Man-->
            <!-- For Follow The Request Status -->
<?php if($Msql): ?>
              <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-success">
                        <div class="panel-heading">
                            <i class="fa fa-bar-chart-o fa-fw"></i> Maintenance
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">

                           <table class="table table-striped table-bordered table-hover">
                                  <thead>
			<tr>
				<td>Service</td>
				<td>Adress</td>
				<td>Problem</td>
				<td>Status</td>
			</tr>
		</thead>
<?php
	
		//var_dump($sql);
foreach ($Msql as $ifrq):
		// For Type de Request
	/*if($ifrq['ID_TYPE'] == 1 ) $typerq = "Installation";
	if($ifrq['ID_TYPE'] == 2 ) $typerq = "Transfer";
	if($ifrq['ID_TYPE'] == 3 ) $typerq = "Maintenance";*/
	// validation request
	if($ifrq['vboss'] == 0 ) {
		$vnrq = "<span class='status'> Not yet </span>";
		$clr = "#F2B968";
	}
	if($ifrq['vboss'] == 1 ){
	$vnrq = "<span class='status'>Accepted </span>";
	$clr = "#F0AD4E";
	} 
	if($ifrq['SEEN'] == 2 ){
	 $vnrq = "<span class='status'>In progress </span>";
	 $clr = "#74C274";
	}
	if($ifrq['ERROR'] == 2 ) {
		$vnrq = "<span class='status'> Error </span>";
		$clr = "#DE6C69";
	}
	if($ifrq['FINISHED'] == 2 ){
		$vnrq = "<span class='status'>Finished With success </span>";
		$clr = "#5CB85C";
	}

?>
		<tbody >
			<tr >
				<td><?=$ifrq['Net']?></td>
				<td><?=$ifrq['ADDRESS1']?></td>
				<td><?=$ifrq['problem']?></td>
				<td style="color: <?= $clr?>"><?=$vnrq;?></td>
			</tr>
		</tbody>
<?php
		endforeach;		
?>
                                </table>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
           
                   
                </div>
                <!-- End Follow-->

</div>
<?php endif;?>
</div>
</div>
<?php endif;?>