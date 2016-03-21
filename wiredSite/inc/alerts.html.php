
<?php
if (session_status() == PHP_SESSION_NONE) {
    session_start();
}
    require dirname(dirname(__FILE__))."/lib/db.lib.php";
    $sql = $db->query("SELECT * FROM notefs WHERE idclient= ".$_SESSION['id']."  Order By id DESC LIMIT 5")->fetchAll();

foreach ($sql as $ntfs):
            
             
?>  
                        <li style="height:35px;">
                            <a id="myAlerts" style="padding : 0px;" href="<?= $ntfs['subject'].",".$ntfs['idrequest'].",".$ntfs['id'] ?>">
                                <div class='alert alert-<?=$ntfs['type']?>'>
                                    <i class="fa fa-tasks fa-fw"></i> Request <?= $ntfs['subject'] ?>
                                    <span class="pull-right text-muted small"><?=$ntfs['date']?></span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>

<?php endforeach;

if(isset($_POST['idntfs'])){
$_SESSION['idntfs'] = $_POST['idntfs'];
} 

?>
                        <!--li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-envelope fa-fw"></i> New request
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li-->
                     
                        <li class="divider"></li>
                        <li>
                            <a id="allntfs" class="text-center" href="#">
                                <strong>See All Alerts</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                   
