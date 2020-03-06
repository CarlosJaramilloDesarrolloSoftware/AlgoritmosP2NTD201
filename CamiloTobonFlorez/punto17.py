numero = 0

numero = input("Digite un número de dos cifras: ")
largo = len(numero) - 1
lista = []
for i in str(numero):
    lista.append(i)
    
print("Número de unidades: " + lista[largo])
print("Número de decenas: " + lista[largo - 1]
print("Número de centenas: ") + lista[largo - 2]
