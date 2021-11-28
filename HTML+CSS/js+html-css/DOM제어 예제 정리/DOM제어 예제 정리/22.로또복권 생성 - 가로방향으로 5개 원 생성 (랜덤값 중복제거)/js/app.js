var div = null;
var text = null;
var num = 1;
var color_arr = ["red", "green", "blue", "aqua", "teal"];
var rand_num_arr = [0, 0, 0, 0, 0];
var idx = 0;

var my_wrap = null;

$(document).ready(function () {

  my_wrap = document.getElementById('wrap');

  make_ball();

})

function make_ball() {

  $("#my_button").click(function () {

    var rand_num = random_generator();
    var is_duplicate = false;

    if (num <= 5) {


      if (num == 1) {
        rand_num_arr[idx] = rand_num;

        div = document.createElement('div');
        div.setAttribute('id', 'my_div' + num);
        text = document.createTextNode(rand_num);

        div.appendChild(text);
        my_wrap.appendChild(div);

        $("#my_div" + num).css(
          {
            width: "50px",
            height: "50px",
            borderRadius: "70%",
            background: color_arr[idx],
            display: "inline-block",
            fontSize: "24px",
            paddingTop: "20px",
            paddingLeft: "30px",
            marginRight: "5px"
          });

        num++;
        idx++;


      }
      else //2,3,4,5
      {

        for (var i = 0; i < idx; i++) {


          if (rand_num == rand_num_arr[i]) {
            is_duplicate = true;
            break;
          }


        }

        if (is_duplicate == true) {

        }
        else if (is_duplicate == false) {
          rand_num_arr[idx] = rand_num;

          div = document.createElement('div');
          div.setAttribute('id', 'my_div' + num);
          text = document.createTextNode(rand_num);

          div.appendChild(text);
          my_wrap.appendChild(div);

          $("#my_div" + num).css(
            {
              width: "50px",
              height: "50px",
              borderRadius: "70%",
              background: color_arr[idx],
              display: "inline-block",
              fontSize: "24px",
              paddingTop: "20px",
              paddingLeft: "30px",
              marginRight: "5px"
            });

          num++;
          idx++;
        }



      }


    }

  });

}

function random_generator() {
  var rand_num = Math.ceil(Math.random() * 45);

  return rand_num;
}