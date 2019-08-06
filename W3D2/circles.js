'use strict';
$(function (){
    //setInterval(sizeIncrease, 250);
    $("#container").on('click', '.circle', disapear);
    $("#mybutton").on('click', newLook);
});
function sizeIncrease() {
    var width=$('.circle').width();
    //console.log(width);
    $('.circle').css({'width': width + 10 + 'px'});
    }
function disapear(){
    $('.circle').remove();
}
function newLook(){
    var newWidth=$("#id1").val();
    var grwAmount=$("#id2").val();
    grwAmount = parseInt(grwAmount, 10);
    var grwRate=$("#id3").val();  
    var circleNumber=$("#id4").val(); 
    circleNumber = parseInt(circleNumber,  10);
     for(let i=0;i<circleNumber;i++){
    $('#container').prepend('<div class="circle"></div>');
     }
   $('.circle').css({'width': newWidth + 'px'});
    setInterval(newInterval, grwRate, grwAmount);
}
function newInterval( grwAmount){
    var startingWidth = $('.circle').width();  
      $('.circle').css({'width': startingWidth + grwAmount + 'px'});
}
