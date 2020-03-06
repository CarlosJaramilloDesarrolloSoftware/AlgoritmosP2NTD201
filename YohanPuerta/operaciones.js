/*Ejercicio número dos del taller parte 2*/

//Declaración de variables
let pGanados = 0;
let pPerdidos = 0;
let pEmpatados = 0;
let ptosPGanados = 3;
let ptosPEmpatados = 1;
let ptosPPerdidos = 0;

//Captura de valores
pGanados = prompt("Ingresar partidos ganados:");
pEmpatados = prompt("Ingresar partidos empatados:");
pPerdidos = prompt("Ingresar partidos perdidos:");

//Proceso e impresión del resultado.
//No se agrega en el proceso de sumatoria pPerdidos*pPtosPerdidos dado que siempre va a dar cero
document.writeln("Total puntos: " + (pGanados*ptosPGanados + pEmpatados*ptosPEmpatados));