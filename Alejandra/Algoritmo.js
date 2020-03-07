 //ejercicio 3 -clase 27
 let rescorrectas = 0; resincorrectas = 0; resenblanco = 0;
let  Total = 0; totalrc, totalri,totalrb;
Console.log("Las respuestas......");
rescorrectas = parseInt(prompt("Ingrese la cantidad de respuestas correctas:  "));
resincorrectas = parseInt(prompt("Ingrese la cantidad de  respuestas incorrectas:  "));
resenblanco = parseInt(prompt("Ingrese la cantidad de  respuestas en blancos:  ")); 

totalrc = rescorrectas * 4;
totalri = resincorrectas* (- 1);
totalrb = resenblanco *0;

Total = totalrb+totalrc + totalri;

Console.log("La puntación es : "+Total);

//ejercicio 4

let NpGandos =0 ; NpPerdidos = 0, NpEmpatados=0; Totalpuntaje; Totalgandos ;Totalperdidos ;totalempatados;

Console.log("Puntaje del equipo en el torneo......");
NpGandos = parseInt(prompt("Ingrese la cantidad de partidos Ganados:  "));
NpEmpatados = parseInt(prompt("Ingrese la cantidad de partidos Empatados:  "));
NpPerdidos = parseInt(prompt("Ingrese la cantidad de partidos Perdidos:  "));

Totalgandos = 3 * NpGandos;
Totalperdidos = 0;
totalempatados = 1 * NpEmpatados;

Totalpuntaje = totalempatados + Totalgandos;

Console.log("El puntaje total del equipo es   : "+Total);

//ejercicio 10
 
let edad1; edad2; diferecia;
Console.log("Comparando edades......");

edad1= parseInt(prompt("Ingrese la edad del primer hermano:  "));
edad2= parseInt(prompt("Ingrese la edad del segundo  hermano:  "));
diferecia = edad1 - edad2;

if(edad1 > edad2){
    Console.log("La edad del hermono mayor es   : "+ edad1);
    
    Console.log("La diferencia con el hemano menor es  : "+ diferecia);
}else if(edad1 < edad2){
    Console.log("La edad del hermono mayor es   : "+ edad2);
    
    Console.log("La diferencia con el hemano menor es  : "+ diferecia);
}else{
    Console.log("Las edades son iguales");
}

//ejercicio 14

let i =0; unidadestrabajadas = 0;;promedio;

Console.log("Calculando incentivos");
for(i= 1; i<=5; i++){
    unidadestrabajadas= parseInt(prompt("Digite la cantidad unidades dia  " + i));
    unidadestrabajadas = unidadestrabajadas + unidadestrabajadas;

}
promedio= unidadestrabajadas / 6;
if(promedio >= 100){
    Console.log("Resibe incentivos");
}else{
    Console.log("No recibe incentivos");
}




//ejercicio 13 

let lado1;lado2;lado3;
Console.log("Triangulo......");
lado1= parseInt(prompt("cuanto mide el lado 1 "));
lado2= parseInt(prompt("cuanto mide el lado 2 "));
lado3= parseInt(prompt("cuanto mide el lado 3 "));

if(lado1 == lado2 ){
      if(lado2==lado3){
        Console.log("Triangulo es equilátero");
      }else{
        Console.log("Triangulo es isósceles");
      }
}else if(lado2 == lado3){
    Console.log("Triangulo es isósceles");
}else{
    Console.log("Triangulo es Escaleno  ");
}

//ejercicio 17 


let num;dec;uni;
Console.log("Numero de decenas y unidades....");
num= parseInt(prompt("Ingrese numero"));

dec=num/10; 
uni = num - dec;
Console.log("Cantidad de decenas es: "+ dec +" Cantidad de unidades: "+uni);







