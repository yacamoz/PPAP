
var create_btn=null;
var wrap=null;
var div=null;
var text='';

$(document).ready(function(){
  wrap=document.getElementById("wrap");

  create_func();

})

function create_func(){
  create_btn = document.getElementById('create_btn');
  create_btn.addEventListener('click', function(){

    div=document.createElement('div');
    div.style.border="1px solid black";
    div.style.width="100px";
    div.style.height="100px";
    div.style.fontWeight="bold";

    text=document.createTextNode('my_div');
    div.appendChild(text);

    wrap.appendChild(div);
  });
}
