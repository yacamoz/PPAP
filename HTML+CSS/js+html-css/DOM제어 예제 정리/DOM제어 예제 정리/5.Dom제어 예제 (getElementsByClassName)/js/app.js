$(document).ready(function() {
    var element = document.getElementsByClassName("check1");
    //클래스 이름이 check1에 해당하는 요소를 모두 가져옴
    //체크박스 정보 모두 가져옴

    console.log(element[0].value);
    console.log(element[1].value);
    console.log(element[2].value);
    //체크박스의 value출력

    console.log(element[0].checked);
    console.log(element[1].checked);
    console.log(element[2].checked);
    //체크박스의 checked출력
    //체크 여부 출력
})