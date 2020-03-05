let n1 = 0;
let n2 = 0;
let unidadesn1 = 0;
let decenasn1 = 0;
let unidadesn2 = 0;
let decenasn2 = 0;



n1 = parseInt(prompt("ingrese el número 1"));
n2 = parseInt(prompt("ingrese el número 2"));

unidadesn1 = n1 % 10;
n1 = n1 / 10;
unidadesn2 = n2 % 10;
n2 = n2 / 10;

decenasn1 = n1 % 10;
decenasn2 = n2 % 10;

console.log("La decena del numero 1 es " + decenasn1 + " y la unidad es " + unidadesn1);
console.log("La decena del numero 2 es " + decenasn1 + " y la unidad es " + unidadesn2);