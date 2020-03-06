lado1 = 0
lado2 = 0
lado3 = 0
tipo_triangulo = ""

lado1 = float(input("Ingresa la medida del primer lado: "))
lado2 = float(input("Ingresa la medida del segundo lado: "))
lado3 = float(input("Ingresa la medida del tercer lado: "))

if lado1 == lado2:
    if lado1 == lado3:
        tipo_triangulo = "Equilátero"
    else:
        tipo_triangulo = "Isósceles"
elif lado1 == lado3:
    tipo_triangulo = "Isósceles"
elif lado2 == lado3:
    tipo_triangulo = "Isósceles"
else:
    tipo_triangulo = "Escaleno"
    
print("El tipo de triángulo es " + tipo_triangulo)
