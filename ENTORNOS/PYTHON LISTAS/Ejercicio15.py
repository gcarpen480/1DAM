#Gonzalo Carretero
#Crear un programa de ordenador para gestionar los resultados de la quiniela de fútbol. Para ello vamos a utilizar dos tablas:

#Equipos: Que es una tabla de cadenas donde guardamos en cada columna el nombre de los equipos de cada partido. En la quiniela se indican 15 partidos.
#Resultados: Es una tabla de enteros donde se indica el resultado. También tiene dos columnas, en la primera se guarda el número de goles del equipo que está guardado en la primera columna
#de la tabla anterior, y en la segunda los goles del otro equipo.
#El programa ira pidiendo los nombres de los equipos de cada partido y el resultado del partido, a continuación se imprimirá la quiniela de esa jornada.

#¿Qué modificación habría que hacer en las tablas para guardar todos los resultados de todas las jornadas de la temporada?

num_equipos_carretero = 15
equipos_carretero = []
resultados_carretero = []

for indice in range(1, num_equipos_carretero + 1):
    equipo1_carretero = input(f"Escriba el nombre del equipo 1 del partido {indice}: ")
    equipo2_carretero = input(f"Escriba el nombre del equipo 2 del partido {indice}: ")
    equipos_carretero.append([equipo1_carretero, equipo2_carretero])

    goles_equipo1_carretero = int(input(f"Introduce los goles anotados por el {equipo1_carretero}: "))
    goles_equipo2_carretero = int(input(f"Introduce los goles anotados por el {equipo2_carretero}: "))
    resultados_carretero.append([goles_equipo1_carretero, goles_equipo2_carretero])

print("APUESTAS")

for (equipo1_carretero, equipo2_carretero), (goles1_carretero, goles2_carretero) in zip(equipos_carretero, resultados_carretero):
    print(f"{equipo1_carretero} - {equipo2_carretero}:", end=" ")

    if goles1_carretero > goles2_carretero:
        print("-> 1")
    elif goles1_carretero < goles2_carretero:
        print("-> 2")
    else:
        print("-> X")
