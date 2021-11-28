$(document).ready(function(){
  var div1 = document.createElement('div');
  var text1=document.createTextNode("my div1");

  div1.appendChild(text1);

  div1.style.width="100px";
  div1.style.height="100px";
  div1.style.background="red";
  
  var div2 = document.createElement('div');
  var text2=document.createTextNode("my div2");

  div2.appendChild(text2);

  div2.style.width="100px";
  div2.style.height="100px";
  div2.style.background="blue";

  var div_wrap=document.getElementById("wrap");

  div_wrap.appendChild(div1);
  div_wrap.appendChild(div2);
  
})

