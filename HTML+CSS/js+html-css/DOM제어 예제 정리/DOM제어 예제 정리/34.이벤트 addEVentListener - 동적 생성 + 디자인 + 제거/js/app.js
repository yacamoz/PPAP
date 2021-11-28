
var create_btn=null;
var wrap=null;
var div=null;
var div_count=1;
var text='';
var index=0;

$(document).ready(function(){
  wrap=document.getElementById("wrap");

  create_func();
  delete_func();

})

function create_func(){
  create_btn = document.getElementById('create_btn');
  create_btn.addEventListener('click', function(){

    div=document.createElement('div');
    div.style.border="1px solid black";
    div.style.width="100px";
    div.style.height="100px";
    div.style.fontWeight="bold";

    text=document.createTextNode('my_div:'+div_count);
    div_count++;
    div.appendChild(text);

    wrap.appendChild(div);
  });
}

function delete_func(){
  delete_btn = document.getElementById('delete_btn');
  delete_btn.addEventListener('click', function(){
    alert("제거!");
    alert(wrap.firstChild);
    wrap.removeChild(wrap.firstChild);
  });
}
