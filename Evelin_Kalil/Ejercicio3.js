let hermano1 = 0;
let hermano2 = 0;
let diferencia = 0;
let mayor = 0;



hermano1 = parseInt(prompt("Ingrese la edad del primer hermano"));
hermano2 = parseInt(prompt("Ingrese la edad del segundo hermano"));


if (hermano1 > hermano2) {
    mayor = hermano1;
    diferencia = hermano1 - hermano2;
} else if (hermano2 > hermano1) {
    mayor = hermano2;
    diferencia = hermano2 - hermano1;
}

console.log("la edad del mayor es:  " + mayor);

console.log("la diferencia entre los hermanos es de:  " + diferencia);