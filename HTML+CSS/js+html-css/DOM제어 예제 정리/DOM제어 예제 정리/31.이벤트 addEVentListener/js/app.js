
var check_age_btn=null;
var age_input=0;

$(document).ready(function(){
  age_input=document.getElementById("age_input");

  check_func();

})

function check_func(){
  check_age_btn = document.getElementById('check_age');
  check_age_btn.addEventListener('click', function(){
    if(age_input.value >= 20){
      alert("성인!");
    } else {
      alert("미성년자!");
    }
  });
}
