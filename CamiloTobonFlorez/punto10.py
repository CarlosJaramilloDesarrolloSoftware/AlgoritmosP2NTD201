edad1=0
edad2=0
diferencia=0
edad_mayor=0
hermano_mayor=""

edad1 = int(input("Digite la edad del primer hermano: "))
edad2 = int(input("Digite la edad del segundo hermano: "))
if(edad1 != edad2):
    if(edad1 > edad2):
        diferencia = edad1 - edad2
        hermano_mayor = "Primer hermano"
        edad_mayor = edad1
    elif(edad2 > edad1):
        diferencia = edad2 - edad1
        hermano_mayor = "Segundo hermano"
        edad_mayor = edad2
    print("el " + hermano_mayor + " es el mayor, tiene " + str(edad_mayor) + " años y la diferencia de edad con su hermano es de " + str(diferencia) + " años")
    
elif(edad1==edad2):
    print("Ambos hermanos tienen la misma edad")
else:
    print("Se ingreso un valor incorrecto")
