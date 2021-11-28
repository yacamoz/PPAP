
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
    text=document.createTextNode('my_div');
    div.appendChild(text);

    wrap.appendChild(div);
  });
}
