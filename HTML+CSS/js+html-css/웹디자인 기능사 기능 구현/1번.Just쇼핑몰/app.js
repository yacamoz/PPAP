$(document).ready(function(){

})

function menu(){
    $(".gnb>li").hover(
        function(){
           $(".lnb").stop().slideDown(500); 
        },
        function(){
            $(".lnb").stop().slideUp(500);
        }
    )
}

function slide(){
    setInterval(slide_move, 3000)
}
var newTop=0;
var slideheight=300;
var slideIndex=0;
function slide_move(){
    newTop = -slideheight*slideIndex;
    $("#slide_contents").animate({top:newTop},400,"swing")
    if(slideIndex==2){
        slideIndex=0;
    }else{
        slideIndex++
    }
}

function tab(){
    $(".tab_btn>a").eq(0).click(function(){
        $(".tab_contents>div").eq(1).hide();
        $(".tab_contents>div").eq(0).show();
    })
    $(".tab_btn>a").eq(1).click(function(){
        $(".tab_contents>div").eq(0).hide();
        $(".tab_contents>div").eq(1).show();
    })
}

function ad_tab(){
    var idx=0;
    $(".tab_btn>a").click(function(){
        idx=$(this).index()
        console.log(idx+"번째")
        $(".tab_contents>div").hide();
        $(".tab_contents>div").eq(idx).show();
    })
}

function popup(){
    $(".pop").click(function(){
        $("#popup").show();
    })
    $("#closeBtn").click(function(){
        $("#popup").hide();
    })
}