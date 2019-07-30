window.onload = myfunction;

  var frame = 0;
   var anim = 0;



function myfunction(){
  document.getElementById("play").onclick = animate;
  document.getElementById("stop").onclick =stop;
  document.getElementById("sizeChange").onchange =changeSize;
  document.getElementById("turbo").onchange =turbo;
}

function animate(){
  clearInterval(anim);
  anim = setInterval(load,500);
}

function stop(){
  clearInterval(anim);
  var stage=document.getElementById("myTextBox");
  stage.value="click start to activate Animation";
}

function changeSize(){
  var sizeChoosen=document.getElementById("sizeChange");
  var sizeChoosenValue=sizeChoosen.options[sizeChoosen.selectedIndex].value;
  var stage=document.getElementById('myTextBox');
  stage.style.fontSize=sizeChoosenValue+"pt";

}

function turbo(){
  if (document.getElementById("turbo").checked){
  clearInterval(anim);
  anim=setInterval(load,100);
}
else {
  clearInterval(anim);
  anim=setInterval(load,500);
}
}

function load(){
 // var animSelectedValue=document.getElementById("animation").value;
 var type= document.getElementById("animation");
 var animSelectedValue = type.options[type.selectedIndex].value;
 var animationArray=ANIMATIONS[animSelectedValue].split("=====");
 var stage=document.getElementById('myTextBox');


if (frame==animationArray.length){
  frame=0;
}
stage.value=animationArray[frame];
 frame++;
}