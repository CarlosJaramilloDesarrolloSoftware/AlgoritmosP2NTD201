let rescorrectas = 0; resincorrectas = 0; resenblanco = 0;
let  Total = 0; totalrc, totalri,totalrb;

rescorrectas = parseInt(prompt("Ingrese la cantidad de respuestas correctas:  "));
resincorrectas = parseInt(prompt("Ingrese la cantidad de  respuestas incorrectas:  "));
resenblanco = parseInt(prompt("Ingrese la cantidad de  respuestas en blancos:  ")); 

totalrc = rescorrectas * 4;
totalri = resincorrectas* (- 1);
totalrb = resenblanco *0;

Total = totalrb+totalrc + totalri;

Console.log("La puntación es : "+Total);