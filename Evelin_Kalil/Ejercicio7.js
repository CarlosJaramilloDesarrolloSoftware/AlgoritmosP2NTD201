let letra = " ";
let totalProduccion = 0;
let vocal = 0;
let consonante = 0;

for (let i = 1; i < 11; i++) {

    console.log(totalProduccion);

    letra = prompt("ingrese la letra número  " + i);

    if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
        vocal = vocal + 1;
    } else {
        consonante = consonante + 1;
    }
}

console.log("El total de consonantes es de " + consonante);
console.log("El total de vocales es de " + vocal);