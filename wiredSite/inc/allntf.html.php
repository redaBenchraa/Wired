         <div id="notef">
                <div class="col-lg-8">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <i class="fa fa-bar-chart-o fa-fw"></i> notefications
                        </div>
 
                        <!-- /.panel-heading -->
                        <div class="panel-body">

<?php
if (session_status() == PHP_SESSION_NONE) {
    session_start();
}
    require dirname(dirname(__FILE__))."/lib/db.lib.php";
    $sql = $db->query("SELECT * FROM notefs WHERE idclient= ".$_SESSION['id']."  Order By id DESC")->fetchAll();

foreach ($sql as $ntfs):
            
             
?>  
                       
                            <a id="myRqNt" style="padding : 0px;" href="<?= $ntfs['subject'].",".$ntfs['idrequest'].",".$ntfs['id'] ?>">
                                <div class='alert alert-<?=$ntfs['type']?>'>
                                    <i class="fa fa-tasks fa-fw"></i> Request <?= $ntfs['subject'] ?>
                                    <span class="pull-right text-muted small"><?=$ntfs['date']?></span>
                                </div>
                            </a>
                      
                       

<?php endforeach; ?>

                        </div>
                       </div>
                  </div>

            </div>