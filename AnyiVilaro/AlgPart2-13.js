/**
 * Tipo triangulo
 */

 var lado1 = 3;
 var lado2 = 1;
 var lado3 = 3;

if (lado1 == lado2 && lado2 == lado3){
     tipoTriangulo = "Equilátero"; 
 }

if (lado1 == lado2 && lado1 != lado3){
    tipoTriangulo = "Isósceles"; 
}

if (lado1 != lado2 && lado2 == lado3){
    tipoTriangulo = "Isósceles"; 
}

if (lado1 == lado3 && lado1 != lado2){
    tipoTriangulo = "Isósceles"; 
}


if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
    tipoTriangulo = "Escaleno"; 
}

console.log("El triangulo es " + tipoTriangulo);
