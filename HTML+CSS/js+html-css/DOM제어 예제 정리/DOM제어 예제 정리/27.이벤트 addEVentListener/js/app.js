

$(document).ready(function(){
  
  var btn = document.getElementById('btn');
  btn.addEventListener('click', function(e){
        alert('Hello world:'+e.target.value);
    });

})

