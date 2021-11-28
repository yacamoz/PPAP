$(document).ready(function(){

    //next_slide();
    slide_next_btn();
    slide_prev_btn();
})

function slide_next_btn(){
    $("#slide_next").click(next_slide
    );
}

function slide_prev_btn(){
    $("#slide_prev").click(prev_slide
    );
}

function next_slide(){
    var slider=$(".customslider");
    slider.find('div').first().appendTo(slider);
}

function prev_slide(){
    var slider=$(".customslider");
    slider.find('div').last().prependTo(slider);
}