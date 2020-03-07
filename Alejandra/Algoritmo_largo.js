let N, CATEGORIA, IMCDEFIF; //VARIABLES
//CONTADORES
let contadorNinos = 0,
    contadorJovenes = 0,
    contadorAdultos = 0,
    contadorViejos = 0,
    contadoredaderror = 0,
    contbajopeso,
    contpesonormal, contpesosuperior, contobesidad;
//ACUMULADORES 
let CantidadDeEncuestados = 0,
    AcumuladorIMC = 0;
//porcentajes y promedios
let porNI, porJo, porAdu, porVie, porbajo, pornormal, porsuperior, porobes, promedioIMC;
//variables al recibir
let peso, estatura, edad;



N = prompt("Digite * si desea abrir el programa");

while (N == "*") {

    CantidadDeEncuestados++;
    edad = parseInt(prompt("Ingrese la edad"));
    peso = parseFloat(prompt("Ingrese la edad"));
    estatura = parseFloat(prompt("Ingrese la edad"));


    IMC = peso / estatura;
    AcumuladorIMC = AcumuladorIMC + IMC;
    categoria(edad);
    corporal(IMC);

    N = prompt(" Si desea seguir digite * de lo contrario digite +");

}

//calculo
porNI = (contadorNinos * 100) / CantidadDeEncuestados;
porJo = (contadorJovenes * 100) / CantidadDeEncuestados;
porAdu = (contadorAdultos * 100) / CantidadDeEncuestados;
porVie = (contadorViejos * 100) / CantidadDeEncuestados;
porbajo = (contbajopeso * 100) / CantidadDeEncuestados;
pornormal = (contpesonormal * 100) / CantidadDeEncuestados;
porsuperior = (contpesosuperior * 100) / CantidadDeEncuestados;
porobes = (contobesidad * 100) / CantidadDeEncuestados;
promedioIMC = CantidadDeEncuestados / AcumuladorIMC;


Console.log("Cantidad de encuestados : " + CantidadDeEncuestados);
Console.log("Cantidad de edades errones : " + contadoredaderror);
Console.log("Cantidad de niños: " + contadorNinos + "Porcentaje: " + porNI);
Console.log("Cantidad de Jovenes: " + contadorJovenes + "Porcentaje: " + porJo);
Console.log("Cantidad de adultos: " + contadorAdultos + "Porcentaje: " + porAdu);
Console.log("Cantidad de viejos: " + contadorViejos + "Porcentaje: " + porVie);
Console.log("Cantidad de personas con bajo peso: " + contbajopeso + "Porcentaje: " + porbajo);
Console.log("Cantidad de personas con peso normal: " + contpesonormal + "Porcentaje: " + pornormal);
Console.log("Cantidad de personas con peso superior: " + contpesosuperior + "Porcentaje: " + porsuperior);
Console.log("Cantidad de personas con peso normal: " + contobesidad + "Porcentaje: " + porobes);
Console.log("Promedio de IMC de las personas encuestadas: " + promedioIMC);




//función categoria 

function categoria(edad) {
    if (edad >= 0 && edad <= 13) {
        CATEGORIA = "Niños";
        contadorNinos++
    } else if (edad >= 14 && edad <= 30) {
        CATEGORIA = "Jovenes";
        contadorJovenes++
    } else if (edad >= 31 && edad <= 60) {
        CATEGORIA = "Adultos";
        contadorAdultos++
    } else if (edad >= 61) {
        CATEGORIA = "Viejos";
        contadorViejos++
    } else {
        contadoredaderror++;
    }
}

function corporal(IMC) {
    if (IMC < 18.5) {
        IMCDEFIF = "Peso  bajo";
        contbajopeso++
    } else if (edad >= 14 && edad <= 30) {
        IMCDEFIF = "Peso normal";
        contpesonormal++
    } else if (edad >= 31 && edad <= 60) {
        IMCDEFIF = "Peso superior";
        contpesosuperior++
    } else if (edad >= 61) {
        IMCDEFIF = "peso obesidad";
        contobesidad++
    } else {
        contadoredaderror++;
    }

}