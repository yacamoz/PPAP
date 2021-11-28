$(document).ready(function(){
    menu()
    ad_tab()
    popup()
    slide()
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
function ad_tab(){
    $("")
}
var newTop=0;
var slideWidth=1200;
var slideIndex=0;
function slide_move(){
    newTop = -slideWidth*slideIndex;
    $("#slide_contents").animate({left:newTop},400,"swing")
    if(slideIndex>=2){
        slideIndex=0;
    }else{
        slideIndex++
    }
}
function slide(){
    setInterval(slide_move, 2000)
}
function popup(){
    $(".pop").click(function(){
        $("#popup").show()
    })
    $("#closeBtn").click(function(){
        $("#popup").hide()
    })
}