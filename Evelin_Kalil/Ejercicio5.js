let lado1 = 0;
let lado2 = 0;
let lado3 = 0;

lado1 = parseInt(prompt("ingrese el lado 1 "));
lado2 = parseInt(prompt("ingrese el lado 2 "));
lado3 = parseInt(prompt("ingrese el lado 3 "));

if (lado1 == lado2 && lado1 == lado3) {
    console.log("El triangulo es equilatero");
} else if ((lado1 == lado2 && lado1 != lado3) || (lado2 == lado3 && lado2 != lado1) || (lado1 == lado3 && lado1 != lado2)) {
    console.log("El triangulo isoceles");
} else if ((lado1 != lado2 && lado1 != lado3) || (lado2 != lado3 && lado2 != lado1) || (lado1 != lado3 && lado1 != lado2)) {
    console.log("El triangulo Escaleno");
}