let numRespCorrectas = 0;
let numRespIncorrectas = 0;
let numRespBlanco = 0;
let puntajeFinal = 0;

numRespCorrectas = parseInt(prompt("ingrese la cantidad de respuestas correctas"));
numRespIncorrectas = parseInt(prompt("ingrese la cantidad de respuestas incorrectas"));
numRespBlanco = parseInt(prompt("ingrese la cantidad de respuestas en blanco"));

puntajeFinal = (numRespCorrectas * 4) + (numRespIncorrectas * -1);

alert("El puntaje final es: " + puntajeFinal);