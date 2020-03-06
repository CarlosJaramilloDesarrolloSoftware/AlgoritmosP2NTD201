partidos_ganados = 0
partidos_empatados = 0
partidos_perdidos = 0
puntaje_g = 0
puntaje_e = 0
puntaje_p = 0

puntos_ganados = 3
puntos_empatados = 1
puntos_perdidos = 0

partidos_ganados = int(input("Digite el número de partidos ganados: "))
partidos_empatados = int(input("Digite el número de partidos empatados: "))
partidos_perdidos = int(input("Digite el número de partidos perdidos: "))

puntaje_g = partidos_ganados * puntos_ganados
puntaje_e = partidos_empatados * puntos_empatados
puntaje_p = partidos_perdidos * puntos_perdidos

puntaje_total = puntaje_g + puntaje_e + puntaje_p

print("El puntaje total es: " + str(puntaje_total))
