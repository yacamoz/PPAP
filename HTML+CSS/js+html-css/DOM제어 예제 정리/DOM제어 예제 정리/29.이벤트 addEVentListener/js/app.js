
var inc_btn=null;
var dec_btn=null;
var counter_val=null;
var counter_val_txt=0;
$(document).ready(function(){
  counter_val=document.getElementById("counter_val");

  inc_func();
  dec_func();
  
})

function inc_func(){
  inc_btn = document.getElementById('inc_btn');
  inc_btn.addEventListener('click', function(e){
    counter_val_txt++;
    counter_val.innerText=counter_val_txt;
  });
}

function dec_func(){
  dec_btn = document.getElementById('dec_btn');
  dec_btn.addEventListener('click', function(e){
    counter_val_txt--;
    counter_val.innerText=counter_val_txt;
  });
}