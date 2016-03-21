 <?php  
if(!isset($_SESSION['id']))
    exit (" You Have Not Access To this page ");
?>
 <style type="text/css">
 #page-wrapper .panel{
    cursor: pointer;
 }
#clkhome a:first-child{
    color:#fff;
    text-decoration: none;

}
 </style>
 <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h4 class="page-header"> </h4> 
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div id="clkhome" class="col-lg-3 col-md-6">
                  <div   class="panel panel-primary">
                         <div  class="panel-heading">
                             <!--a href="?"--> <div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-home fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">Home</div>
                                    <div style="color:#337AB7">-</div>
                                </div>
                            </div> <!--/a-->
                        </div>
                        <a>
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>

                    </div>
                </div>
                <div id="clkrq" class="col-lg-3 col-md-6">
                    <div class="panel panel-green">
                        <div class="panel-heading">
                            <!--a href="?client=request"--><div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-tasks fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">Request</div>
                                    <div>Follow your Requests</div>
                                </div>
                            </div><!--/a-->
                        </div>
                        <a>
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>
                <div id="clksendrq"  class="col-lg-3 col-md-6">
                    <div class="panel panel-yellow">
                        <div class="panel-heading">
                           <!--a href="?client=sendrequest"--><div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-pencil fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">Request</div>
                                    <div>Send a New Request!</div>
                                </div>
                            </div><!--/a-->
                        </div>
                        <a>
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>
                <div id="clkaccount"  class="col-lg-3 col-md-6">
                    <div class="panel panel-red">
                        <div class="panel-heading">
                          <!--a href="?client=account"-->  <div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-user fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">Account</div>
                                    <div>Manager Your Account!</div>
                                    <div></div>
                                </div>
                            </div> <!--/a-->
                        </div>
                        <a>
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
            <!-- /.row -->
