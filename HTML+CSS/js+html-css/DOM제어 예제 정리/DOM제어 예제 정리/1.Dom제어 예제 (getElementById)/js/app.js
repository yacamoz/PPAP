$(document).ready(function(){
  var element = document.getElementById("my_div");
  element.style.color = "red";
  
  /*
  웹 페이지에 존재하는 HTML 요소에 접근하고자 할 때는 
  반드시 Document 객체부터 시작해야 합니다.
  */

  /*
  getElementById
  :아이디 이름으로 HTML 요소에 접근
  */

  /*
  element에는 아이디가 my_div인 요소에 접근한 정보가 들어있음
  (주소가 들어있다고 생각하면 됩니다.)

  element.style.color="red";
  :my_div의 스타일중 색깔을 빨간색으로 하겠다.
  */
})

