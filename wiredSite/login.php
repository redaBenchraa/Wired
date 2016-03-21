<!DOCTYPE html>
<?php
/**
** Walid Hammioui
**/
    session_start();
    require 'lib/db.lib.php';
     $errorlogin = "";
    if(isset($_POST) && !empty($_POST)):
        $fullname = $_POST['name'];
        $pass = $_POST['password'];
    try{
        $sql = $db->query("SELECT * FROM client WHERE  fullname = '$fullname' and password = '$pass'")->fetch();
        if($sql){
            $_SESSION['id'] = $sql['id'];
            $_SESSION['fullname'] = $sql['fullName'];
            echo '
            <div class="alert alert-success alert-dismissable" style="width:800px; text-align:center; margin:auto;">
                                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                              Success , Please Wait ... <a href="index.php" class="alert-link">Or Click Here.</a>.
                            </div>';
            header("location:index.php");
        }else{
            $errorlogin =  '
            <div class="alert alert-danger alert-dismissable" style="width:800px; text-align:center; margin:auto;">
                                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                               The user name and password you entered did not match those found in our files. 
                               Please check and try again.. <a href="#" class="alert-link"> Forgot password?</a>.
                            </div>';
    }
}catch(PDOexception $e){
        exit($e);
    }
    endif;

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

    <!-- Custom CSS -->
    <link href="css/rmanager.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="css/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
     <!-- / theme file [required] -->
    <link href="css/light-theme.css" media="all" id="color-settings-body-color" rel="stylesheet" type="text/css">
    <!-- / coloring file [optional] (if you are going to use custom contrast color) -->
    <link href="css/theme-colors.css" media="all" rel="stylesheet" type="text/css">


    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body class="login contrast-background">
    <div class="middle-container">
      <div class="middle-row">
        <div class="middle-wrapper">
          <div class="login-container-header">
            <div class="container">
              <div class="row">
                <div class="col-sm-12 col-lg-12">
                 <center>
                    <img src="FirstBG.png" class="img-responsive" alt="Wired" />
                  </center>
                </div>
              </div>
            </div>
          </div>
          <div class="login-container">
            <div class="container">
              <div class="row">
                <div class="col-sm-4 col-sm-offset-4">
                  <h1 class="text-center title">Sign in</h1>
                  <form  novalidate="novalidate"  class="validate-form" method="post">
                    <div class="form-group">
                      <div class="controls with-icon-over-input">
                        <input  value="" placeholder="Full Name" class="form-control" data-rule-required="true" name="name" type="text">
                        <i class="icon-user text-muted"></i>
                      </div>
                    </div>
                    <div class="form-group">
                      <div class="controls with-icon-over-input">
                        <input  value="" placeholder="Password" class="form-control" data-rule-required="true" name="password" type="password">
                        <i class="icon-lock text-muted"></i>
                      </div>
                    </div>
                    <div class="checkbox">
                      <label for="remember_me">
                        <input id="remember_me" name="remember_me" value="1" type="checkbox">
                        Remember me
                      </label>
                    </div>
                    <button class="btn btn-block">Sign in</button>
                  </form>
                  <div class="text-center">
                    <hr class="hr-normal">
                    <a href="#">Forgot your password?</a>
                  </div>
                </div>
              </div>
            </div>
          </div>
                  <center><?= $errorlogin ;?></center>
          
          <div class="login-container-footer">
            <div class="container">
              <div class="row">
                <div class="col-sm-12">
                  <div class="text-center">
                    
                      <i class="fa fa-sliders"></i>
                      Wired
                      <strong>V0.1</strong>
                   
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    <script src="js/theme.js"></script>
<script src="js/jquery.validate.min.js" type="text/javascript"></script>
</body>

</html>
