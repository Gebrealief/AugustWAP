'use strict';
$(function (){
    $('#circle').setInterval(sizeIncrease, 250);
    $("#circle").on('click', disapear);
});
function sizeIncrease() {
    $('#circle').css('width', width+10);
    }
function disapear(){
    $('#circle').hide();
}
