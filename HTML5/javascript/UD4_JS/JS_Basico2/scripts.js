function option() {
    choice1 = "https://www.youtube.com/watch?v=FXruzug7A54"
    choice2 = "https://www.youtube.com/watch?v=Zcb8yPEItwA"
    diffChoice = "https://www.youtube.com/shorts/1puR8jGK03A"
    let choice = prompt("Sin animo de lucro, tú qué prefiere? Una tortilla de patata o dar sieta caja de valeriana", "Escriba 1 o 2 según su elección");
    switch (choice) {
        case "1":
            window.open(choice1);
            break;
        case "2":
            window.open(choice2);
            break;
        case "1":
            window.open(diffChoice);
            break;
    }
}

function checkApples() {
    
    
}

function addApple() { //clicker de manzanas. Añade manzanas
    var appleNumVal = document.getElementById("numApples").innerHTML;
    appleNumVal++;
    document.getElementById("numApples").innerHTML = appleNumVal;
    var x = document.getElementById("appleImg").width;
    var y = document.getElementById("appleImg").height;
    x++; y++;
}

function removeApple() { //clicker de manzanas. Resta manzanas
    var appleNumVal = document.getElementById("numApples").innerHTML;
    if (appleNumVal > 0) {
        appleNumVal--;
        document.getElementById("numApples").innerHTML = appleNumVal;
    }
    document.getElementById("numApples").innerHTML = appleNumVal;
}

function resetApple() { //clicker de manzanas. Reestablece las manzanas a cero
    document.getElementById("numApples").innerHTML = 0;
}

function operations(){ //realiza una operación matemática entre dos valores enteros
    var val1 = parseInt(prompt("Ponga un número", "1")); //parsea a int
    var operator = prompt("Seleccione un operador", "+ - x /")
    var val2 = parseInt(prompt("Ponga otra número", "2")); //parsea a int
    var result;

    switch (operator){ //según el valor de la operación realiza un operando u otro
        case "+":
            result = val1 + val2;
            break;
        case "-":
            result = val1 - val2;
            break;
        case "*":
            result = val1 * val2;
            break;
        case "/":
            result = val1 / val2;
            break;
    }
    document.getElementById("result").innerHTML = "Resultado: " + result; //se escribe el resultado en la web
}