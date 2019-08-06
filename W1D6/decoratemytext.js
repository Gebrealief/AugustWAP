
function alrt(){
   var x = document.getElementById("txt");
    console.log(x.style.fontSize);
    var fontSize = x.style.fontSize.split('p')[0];
   x.style.fontSize = parseInt(fontSize, 10) + 2 + "pt";
};
function chkAlert(){
    var x = document.getElementById("txt");
   
    if (chk.checked) {
        x.style.fontWeight = "bold";
      } else {
        x.style.fontWeight = "normal";
      }
 };
 window.onload = function () {
     "use strict";

     var bigButton = document.getElementById('big-button');
     bigButton.onclick = ()=> {
         setInterval(function(){
            alrt();
         },500);
        
     }
     
     
 };