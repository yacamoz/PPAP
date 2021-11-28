var slideIndex=0;
var curIdx=0;

$(document).ready(function(){

    menu(); 
    init();
    slide();
    tab();
    popup();
})
function menu(){
    var idx=0;
   $(".gnb>li").hover(
       function(){
        idx = $(this).index();
        $(".gnb>li").eq(idx).find(".lnb").stop().slideDown(500);
       },
       function(){  
           $(".lnb").stop().slideUp(500);
       }
   );
}

function init(){

    for(var i=0; i<=2; i++){
        $("#slide_contents>img").eq(i).hide();
    }
    $("#slide_contents>img").eq(0).show();
}

function slide(){
    setInterval(slide_fade,3000);
}

function slide_fade(){

    $("#slide_contents>img").eq(slideIndex).fadeOut(1000);

    if(slideIndex+1>2){
        $("#slide_contents>img").eq(0).fadeIn(1000);
        slideIndex=0;
    } else {
        $("#slide_contents>img").eq(slideIndex+1).fadeIn(1000);
        slideIndex++;   
    }
 
}

function tab(){
    $(".tab_btn>a").eq(0).click(function(){

        $(".tab_contents>div").eq(0).show();
        $(".tab_contents>div").eq(1).hide();
    })

    $(".tab_btn>a").eq(1).click(function(){

        $(".tab_contents>div").eq(1).show();
        $(".tab_contents>div").eq(0).hide();
    })
}

function popup(){

    $(".notice_list>li").eq(0).click(function(){
        $("#popup").show();
    });

    $("#popup>#closeBtn").click(function(){
        $("#popup").hide();
    });

}