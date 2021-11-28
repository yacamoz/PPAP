let plustodo = document.getElementById("addtodo");
let todocon = document.getElementById("todoContainer");
let inputf = document.getElementById("inputfield");

plustodo.addEventListener('click', function(){
    var paragraph = document.createElement('p')
    paragraph.classList.add('paragraph-styling')
    paragraph.innerText=inputf.value;
    inputf.value="";
    todocon.appendChild(paragraph);
    paragraph.addEventListener('click', function(){
        paragraph.style.textDecoration = "line-through"
    })
    paragraph.addEventListener('dblclick', function(){
        todocon.removeChild(paragraph);
    })
})
