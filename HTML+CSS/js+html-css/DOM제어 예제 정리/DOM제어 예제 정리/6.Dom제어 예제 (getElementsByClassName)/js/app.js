$(document).ready(function(){
  var element = document.getElementsByClassName("radio1");
  //라디오버튼 접근

  console.log(element[0].value);
  console.log(element[1].value);
  console.log(element[2].value);
  //라디오 버튼의 값 출력

  console.log(element[0].checked);
  console.log(element[1].checked);
  console.log(element[2].checked);
  //라디오 버튼의 선택 여부 (체크 여부) 출력
})

