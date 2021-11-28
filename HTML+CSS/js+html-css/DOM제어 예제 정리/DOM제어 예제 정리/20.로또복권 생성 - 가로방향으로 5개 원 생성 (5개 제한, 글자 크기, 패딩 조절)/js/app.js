$(document).ready(function(){

  const button = document.getElementById('my_button');
  var my_wrap = document.getElementById('wrap');
  var div=null;
  var text=null;
  var num=1;
  var color_arr=["red","green","blue","aqua","teal"];
  var idx=0;
  button.addEventListener('click', event => {

  if(num<=5)
  {

      div = document.createElement('div');
  div.setAttribute( 'id', 'my_div'+num );
  text=document.createTextNode(num);

  div.appendChild(text);
  my_wrap.appendChild(div);

    $("#my_div"+num ).css(
    {
      width:"50px",
      height:"50px",
      borderRadius:"70%",
      background:color_arr[idx],
      display:"inline-block",
      fontSize:"24px",
      paddingTop:"20px",
      paddingLeft:"30px"
    });

  num++;
  idx++;

  }


});

})

