unidades = 0
mensaje = ""
validacion = True
respuesta = ""
while validacion == True:
    #respuesta = input("Desea continuar registrando produccion s/n: ")
    #validacion = if respuesta
    unidades = int(input("Digite las unidades producidas por el operario (de lunes a sabado): "))

    if unidades >= 100:
        mensaje = "Recibira incentivos"
    else:
        mensaje = "No recibira incentivos"
        
    print("El operario " + mensaje)
    respuesta = input("Desea continuar registrando s/n: ")
    validacion = True if respuesta.lower() == 's' else False
