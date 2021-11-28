var div = null;
var text = null;
var num = 1;
var total_count=1;
var color_arr = ["red", "green", "blue", "aqua", "teal"];
var rand_num_arr = [0, 0, 0, 0, 0];
var idx = 0;

var my_wrap = null;

$(document).ready(function () {

  my_wrap = document.getElementById('wrap');

  $("#my_button").click(function(){

    make_rand_arr();
    make_ball();
    init_rand_num_arr();

  });

})

function init_rand_num_arr()
{
  for(var i=0; i<=4; i++)
  {
    rand_num_arr[i]=0;
  }
}

function make_rand_arr(){

  var rand_num = 0;
  var is_duplicate = false;

  for(var i=0; i<=4; i++)
  {

    rand_num = random_generator();

      if(  i == 0 ){
        rand_num_arr[i]=rand_num;
      }
      else{

        for(var j=0; j<i; j++)
        {

          if(rand_num_arr[j] == rand_num){
            is_duplicate=true;
            break;
          }

        }

        if(is_duplicate==true)
        {
          i=i-1;
        }
        else if(is_duplicate==false)
        {
          rand_num_arr[i] = rand_num;
        }
        is_duplicate=false;

      }

  }

  rand_num_arr.sort(function(a, b) { // 오름차순
    return a - b;
  });

}

function make_ball() {

  for(var i=0; i<=4; i++)
  {
    
    div = document.createElement('div');
    div.setAttribute('id', 'my_div' + total_count);
    text = document.createTextNode(rand_num_arr[i]);

        div.appendChild(text);
        my_wrap.appendChild(div);

        $("#my_div" + total_count).css(
          {
            width: "50px",
            height: "50px",
            borderRadius: "70%",
            background: color_arr[i],
            display: "inline-block",
            fontSize: "24px",
            paddingTop: "20px",
            paddingLeft: "30px",
            marginRight: "5px",
            marginBottom:"10px"
          });
        idx++;
        total_count++;
    
  }

  var my_br = document.createElement('br');
      my_wrap.appendChild(my_br);

}

function random_generator() {
  var rand_num = Math.ceil(Math.random() * 45);

  return rand_num;
}