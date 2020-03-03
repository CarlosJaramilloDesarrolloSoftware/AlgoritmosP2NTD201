vocales = ["a", "e", "i", "o", "u"]
letras = ""
c_vocales = 0
c_consonantes = 0
validacion = True

letras = input("Digite 10 letras cualquiera: ")

for i in letras:
    validacion = True
    for j in vocales:
        if i == j:
            c_vocales = c_vocales + 1
            validacion = False

    if validacion == True:
        c_consonantes = c_consonantes + 1

print("número de vocales: " + str(c_vocales))
print("Número de consonantes: " + str(c_consonantes))
