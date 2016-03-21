<!DOCTYPE html>
<?php
/**
** Walid Hammioui
**/
	session_start();
if(!isset($_SESSION['id']))
	header("location:login.php");
$_SESSION['lmt'] = 5;
if(!isset($_SESSION['cnntf']))
$_SESSION['cnntf'] = 0;
   require dirname(dirname(__FILE__))."/lib/db.lib.php";
try {
	$clientrq = $db->query("SELECT idrequest,id_user FROM request where idclient = ".$_SESSION['id']." ORDER BY idrequest DESC")->fetchall();
} catch (Exception $e) {
	exit($e);
}
?>	
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Wired</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="css/plugins/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Timeline CSS -->
    <link href="css/plugins/timeline.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/rmanager.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="css/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<!-- styles needed by jScrollPane -->
<link type="text/css" href="css/jquery.jscrollpane.css" rel="stylesheet" media="all" />
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
    
       <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="true" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
                <a class="navbar-brand" href="index.php">Wired</a>
            </div>
            <!-- /.navbar-header -->
<?php 
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
?>
    <div aria-expanded="true" class="collapse navbar-collapse in" id="bs-example-navbar-collapse-1">
            <ul id="msgnot" class="nav navbar-nav  navbar-right">
                <li  class="dropdown">
                    <a id="imsg" class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fanb" value="<?php if($cntm > 0 ) echo $cntm; ?>"> <?php if($cntm > 0 ) echo $cntm; ?></i> 
                        <i class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    
                    <!-- /.dropdown-messages -->

                    <?php include "msgheader.html.php"; ?>
                    
                    <!-- /.dropdown-messages -->
                </li>
                <!-- /.dropdown -->
            
                <li  class="dropdown">
                    <a id="intf" class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i  style="color:#D1F1EE" id="fanb" class="fanb"><?php if($cntf > 0 ) echo $cntf; ?></i> 
                        <i class="fa fa-bell fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                <ul class="dropdown-menu dropdown-alerts">
                    <?php include "alerts.html.php";?>

                </ul>


                    <!-- /.dropdown-alerts -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  
                        <span class="navbar-right" style="color:#fff; padding:0px 6px;"> <?= $_SESSION["fullname"];?></span>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li id="clkprofile" ><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li id="clkstting"><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="logout.php"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
        </div>  
    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Custom Theme JavaScript -->
    <script src="js/rmanager.js"></script>
    <!-- the mousewheel plugin - optional to provide mousewheel support -->
<script type="text/javascript" src="js/jquery.mousewheel.js"></script>

<!-- the jScrollPane script -->
<script type="text/javascript" src="js/jquery.jscrollpane.min.js"></script>
</body>

</html>
