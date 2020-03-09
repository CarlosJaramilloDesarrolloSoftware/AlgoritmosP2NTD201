var arrayLetras = [];

for(var i=1;i<=10;i++){
    letra = prompt("Letra: " + i + ". Ingresar Letra: ", "");
    arrayLetras.push(letra);
}

var contadorVocales = 0;
var contadorConsonantes = 0;
arrayLetras.forEach(item => {
    if(item == "a" || item == "e" || item == "i" || item == "o" || item == "u" ||
    item == "A" || item == "E" || item == "I" || item == "O" || item == "U"){
        contadorVocales++;
    }else{
        contadorConsonantes++;
    }
});

console.log("Vocales: " + contadorVocales + " Consonantes: " + contadorConsonantes);
