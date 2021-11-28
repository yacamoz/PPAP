$(document).ready(function(){

    next_slide();
})

function next_slide(){
    var slider=$(".customslider");
    slider.find('div').first().appendTo(slider);

}