var isnewmsg = false;
var animStep = true;
var origTitle = document.title;
//var lastid = 0;
//var timerpr = setInterval(getnewmsg,5000);
var dmsg = 0;
var nmsg = 0;
var oart = null;
var nart = null;
var mStsRq = 10;
var hnart = false;
var timer =  setInterval(notification,3000);
$(function() {
$("#notefs").mouseenter(function(){
 console.log("enter");
        
      clearInterval(timer);
});
$("#notefs").mouseleave(function(){
 console.log("over");
         timer =  setInterval(notification,3000)
        
});
   
 //   getnewmsg();
     dmsg =  $('.fanb').attr('value');
    refresh(); 
     animateTitle();
     timer;
      //playSound("sound.mp3");
    $(document).on('click','#readmsg', function(){
      $('.dropdown').removeClass('open');
        var link = $(this).attr('href');
        var idmsg = link.split('=');
        
          //$("#ttmsg").css("background-color","blue");
       //alert(idmsg[1]);
        $.post('inc/readmsg.html.php',{idmsg:idmsg[1],user:idmsg[2]},function(data){
             $("#mydiv").html(data);
        });
         $( "#imsg" ).load( "inc/nothead.html.php #ig" );
        $( ".dropdown-messages" ).load( "inc/msg.ajax.php" );
        isnewmsg = false;
        return false;
    });
    
    $(document).on('click','#readmsg2',function(){

        var link = $(this).attr('href');
        var idmsg = link.split('=');
        var paty = $(this).parent();
        $(".read-messages li").removeClass('active');
        $(".read-messages li a").removeClass('active');
        $(this).addClass('active');
        $(paty[0]).addClass('active');

        if($(paty[0]).hasClass("noReadMsg"))
          $(paty[0]).removeClass("noReadMsg").addClass('active');

        console.log(paty[0]);
        //$(paty[0]).removeClass();
      $(this).blur();
        $('#rmsg2').load("inc/allmsg.html.php > *",{idmsg:idmsg[1],user:idmsg[2]});
        return false;
        
    });
$('#imsg').click(function(){
        isnewmsg = false;
    });    
   // $('#side-menu').metisMenu
     // Read All message
$(document).on("click","#allmsg",function(){
  $('.dropdown').removeClass('open');
    $.ajax({
          url: "inc/readmsg.html.php",
          async: true
      }).done(function(result) {
          $("#mydiv").html(result);
      });
    return false;
   });

$(document).on("click","#allntfs",function(){
  $('.dropdown').removeClass('open');
    $.ajax({
          url: "inc/allntf.html.php",
          async: true
      }).done(function(result) {
          $("#mydiv").html(result);
      });
    return false;
   });
$(document).on('click','#myRqNt',function(){
 var link = $(this).attr('href');
  var idrq = link.split(',');
            $.ajax({
                url: "inc/rqdtl.html.php",
                type:'POST',
                data: {idrq:idrq[1]},
                async: true
            }).done(function(result) {
              mStsRq = mStsRq + 5;
                $("#mydiv").html(result);
            });
        return false;
            
          });
$(document).on('click','#myAlerts',function(){
$('.dropdown').removeClass('open');
 var link = $(this).attr('href');
  var idrq = link.split(',');
            $.ajax({
                url: "inc/rqdtl.html.php",
                type:'POST',
                data: {idrq:idrq[1]},
                async: true
            }).done(function(result) {
              mStsRq = mStsRq + 5;
                $("#mydiv").html(result);
            });
        return false;
            
          });
$(document).on('click','#intf',function(){
    $("#intf").load( "inc/nothead.html.php #in",{ntz:0});
        return false;
          });

  /**intf
  * Call Pages 
  
  **/
        // For Call Home Page
        $("#clkhome").click(function(){

            $.ajax({
                url: "inc/home.html.php",
                async: true
            }).done(function(result) {
                $("#mydiv").html(result);
            });
   
        return false;
            
          });
           $(document).on('click','#mStsRq',function(){

            $.ajax({
                url: "inc/home.html.php",
                type:'POST',
                data: {mStsRq:mStsRq},
                async: true
            }).done(function(result) {
              mStsRq = mStsRq + 5;
                $("#mydiv").html(result);
            });
        return false;
            
          });
        // For Call Following Page
        $("#clkrq").click(function(){

              $.ajax({
                  url: "inc/follow.html.php",
                  async: true
              }).done(function(result) {
                  $("#mydiv").html(result);
              });

           });
        // For Call Sending Page 
        $('#clksendrq').click(function(){
              $.ajax({
                url: "inc/sendreq.html.php",
                async: true
            }).done(function(result) {
                $("#mydiv").html(result);
            });

        });
        // For Call following Page
        $("#vdrq").click(function(){
             $.ajax({
                    url: "inc/follow.html.php",
                    async: true
                }).done(function(result) {
                    $("#mydiv").html(result);
                });
                     
        });
        // Call Acc Page clkaccount
        $("#clkaccount").click(function(){
             $.ajax({
                    url: "inc/profile.html.php",
                    async: true
                }).done(function(result) {
                    $("#mydiv").html(result);
                });
          return false;
        });
 $("#clkstting").click(function(){
             $.ajax({
                    url: "inc/profile.html.php",
                    async: true
                }).done(function(result) {
                    $("#mydiv").html(result);
                });
return false;
        });
  $("#clkprofile").click(function(){
             $.ajax({
                    url: "inc/profile.html.php",
                    async: true
                }).done(function(result) {
                    $("#mydiv").html(result);
                });
return false;
        });
    // notification 
    $("#closentf").click(function(){
      $('#ntf').fadeOut();
    });
    

});
function refresh(){
       setInterval(function() {
                $( "#imsg" ).load( "inc/nothead.html.php #ig" );
                $( "#intf" ).load( "inc/nothead.html.php #in" );
                $( ".dropdown-messages" ).load( "inc/msg.ajax.php" );
                 nmsg =  $('#fanb').attr('value');
                   if(dmsg < nmsg){
                    isnewmsg = true;
                    dmsg = nmsg;
                  $('#rmsg').load("inc/readmsg.html.php #rmsg > *");
                   }

              //  getnewmsg();
                }, 3000);
   setInterval(function(){
              $('#hmreq').load("inc/home.html.php #hmreq > *");
              
   },3000);
       setInterval(function(){
                 // $('#hmreq').load("inc/home.html.php #hmreq > *");
                    //nsts = $("#vdrq").attr('value');
                   /*if(osts != nsts){
                    osts = nsts;

                   }*/
                       
                    nart = $('#myAlerts').attr('href');
                         var idntf = nart.split(',');
                
             
                                 
                $( ".dropdown-alerts" ).load( "inc/alerts.html.php",{idntfs:idntf[2]});

    
                   
       },3000);
  
}
function notification(){
 
      $('#ntf').fadeIn();
      $('#ntf').delay(4000).fadeOut("slow");
      //hnart = false;
$('#notefs').load("inc/notefs.html.php");
    ///setTimeout(notification, 3000);

};

function animateTitle() {
    if (isnewmsg) {
        if (animStep) {
            document.title = origTitle;
        } else {
            document.title = "New Message - "+origTitle ;
        }
        animStep = !animStep;
    } else {
            document.title = origTitle;
            animStep = false;
    }
    setTimeout(animateTitle, 2000);
};
//Loads the correct sidebar on window load,
//collapses the sidebar on window resize.
// Sets the min-height of #page-wrapper to window size

$(function() {
    $(window).bind("load resize", function() {
        topOffset = 50;
        width = (this.window.innerWidth > 0) ? this.window.innerWidth : this.screen.width;
        if (width < 768) {
            $('div.navbar-collapse').addClass('collapse');
            topOffset = 100; // 2-row-menu
        } else {
            $('div.navbar-collapse').removeClass('collapse');
        }

        height = (this.window.innerHeight > 0) ? this.window.innerHeight : this.screen.height;
        height = height - topOffset;
        if (height < 1) height = 1;
        if (height > topOffset) {
            $("#page-wrapper").css("min-height", (height) + "px");
        }
    });
});
