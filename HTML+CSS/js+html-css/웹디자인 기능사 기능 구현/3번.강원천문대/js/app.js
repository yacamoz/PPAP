$(document).ready(function(){
    menu()
    ad_tab()
    popup()
    slide()
})

function menu(){
    var idx=0;
    $(".gnb>li").hover(
        function(){
            idx=$(this).index();
           $(".gnb>li").eq(idx).find(".lnb").stop().slideDown(500); 
        },
        function(){
            $(".lnb").stop().slideUp(500);
        }
    )
}

function slide(){
    setInterval(slide_move, 1500)
}
var newTop=0;
var slideheight=300;
var slideIndex=0;
function slide_move(){
    $("#slide_contents>img").eq(slideIndex).fadeOut(1000);
    if(slideIndex+1>2){
        $("#slide_contents>img").eq(0).fadeIn(1000);
        slideIndex=0;
    } else {
        $("#slide_contents>img").eq(slideIndex+1).fadeIn(1000);
        slideIndex++;   
    }
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
    $("#popup").show()

    $("#closeBtn").click(function(){
        $("#popup").hide()
    })
}