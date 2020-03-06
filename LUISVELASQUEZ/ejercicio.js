let puntajeCorrectas = 4, puntajeIncorrectas = -1, puntajeBlanco = 0, cantidadCorrectas, cantidadIncorrectas, cantidadBlanco;

// peoceso

cantidadIncorrectas = Number(prompt("Ingrese la cantidad de respuestas incorrectas: "));
cantidadCorrectas = Number(prompt("Ingrese cantidad de respuestas correctas"));
cantidadBlanco = Number(prompt("Ingrese cantidad de respuestas en blanco"));

console.log("//////**********////////");
        console.log("Tu puntuación");
        console.log("//////**********////////");
        console.log((cantidadBlanco * puntajeBlanco)
                + (cantidadIncorrectas * puntajeIncorrectas)
                + (cantidadCorrectas * puntajeCorrectas));
