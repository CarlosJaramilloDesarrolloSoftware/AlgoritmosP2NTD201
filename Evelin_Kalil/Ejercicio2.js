let partidosGanados = 0;
let partidosPerdidos = 0;
let partidosEmpatados = 0;
let nombreEquipo = " ";


nombreEquipo = prompt("Ingrese el nombre del equipo");

partidosGanados = parseInt(prompt("Ingrese el número de partidos ganados"));
partidosPerdidos = parseInt(prompt("Ingrese el número de partidos perdidos"));
partidosEmpatados = parseInt(prompt("Ingrese el número de partidos empatados"));

puntajeTotal = (partidosGanados * 3) + partidosEmpatados;

console.log("El puntaje total de " + nombreEquipo + " es: " + puntajeTotal);