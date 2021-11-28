$(document).ready(function(){
  var element1 = document.getElementById("my_div1");
  element1.innerText = "<b>red</b>";
  //innerText는 글자 형태로만 넣을수 있게
  //글자 진하게 하는 <b>태그를 넣어도 적용이 안되고 글자 그대로 들어갑니다.

  var element2 = document.getElementById("my_div2");
  element2.innerHTML = "<b style=color:red;>DOM Object</b>";
  //innerHTML은 태그도 넣을수 있음
  //진하게, 빨간색이 적용됨
})

