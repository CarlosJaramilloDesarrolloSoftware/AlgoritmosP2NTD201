let produccion = 0;
let totalProduccion = 0;

for (let i = 1; i < 6; i++) {
    console.log(totalProduccion);
    produccion = parseInt(prompt("ingrese la producción (Unidades) del día " + i));
    totalProduccion = totalProduccion + produccion;
}

if (totalProduccion <= 100) {
    console.log("No haz logrado la producción sufieciente para el incentivo");
} else {
    console.log("haz logrado la producción sufieciente para el incentivo");
}