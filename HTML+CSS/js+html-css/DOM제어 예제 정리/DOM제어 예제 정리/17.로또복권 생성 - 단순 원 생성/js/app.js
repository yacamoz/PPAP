$(document).ready(function(){

  const button = document.getElementById('my_button');
  var my_wrap = document.getElementById('wrap');
  var div=null;
  var text=null;
  var num=1;

  button.addEventListener('click', event => {

  div = document.createElement('div');
  div.setAttribute( 'id', 'my_div'+num );
  text=document.createTextNode("new");

  /*
    $("#my_div").css(
    {
      width:"100px",
      height:"100px",
      borderRadius:"70%",
      background:"red",
    }
  )
  여기서 적용하면 적용이 안됨
  DOM에 추가되기전이라
  */

  div.appendChild(text);
  my_wrap.appendChild(div);

    $("#my_div"+num ).css(
    {
      width:"100px",
      height:"100px",
      borderRadius:"70%",
      background:"red",
    }
  )
  num++;

});

})

