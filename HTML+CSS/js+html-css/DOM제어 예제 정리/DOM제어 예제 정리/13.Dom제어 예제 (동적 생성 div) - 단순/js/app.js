$(document).ready(function(){
  var div1 = document.createElement('div');
  //div를 생성 하여 div1에 할당

  var text1=document.createTextNode("my div1");
  //글자를 넣을수 있는 텍스트노드 생성하고 my div1 글자를 넣음

  div1.appendChild(text1);
  //div1에 text1을 자식요소로 추가
  //div태그 안에 글자를 넣을수있는 텍스트 노드를 추가했다는 말
  //이 과정이 반드시 필요
  //태그안에 텍스트 노드가 있어야 글자가 들어갈수 있습니다.

  var div2 = document.createElement('div');
  //div를 생성 하여 div2에 할당
  var text2=document.createTextNode("my div2");
  //글자를 넣을수 있는 텍스트노드 생성하고 my div2 글자를 넣음

  div2.appendChild(text2);
  //div2에 text2를 자식요소로 추가
  //div태그 안에 글자를 넣을수있는 텍스트 노드를 추가했다는 말
  //이 과정이 반드시 필요
  //태그안에 텍스트 노드가 있어야 글자가 들어갈수 있습니다.

  var div_wrap=document.getElementById("wrap");
  //아이디 wrap에 접근하여 

  div_wrap.appendChild(div1);
  div_wrap.appendChild(div2);
  //거기에 완성된 div인 (글자까지 넣은)
  //div1,div2를 wrap의 자식요소로 추가
  
})

