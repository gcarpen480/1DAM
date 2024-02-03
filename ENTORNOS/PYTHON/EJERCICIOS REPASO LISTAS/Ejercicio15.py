#Ejercicio15

numequipos = 2
equipos = []
resultado = []

for i in range (0,numequipos):
    print("Introduzca el nombre del equipo",i,":")
    equipo = input()

    print("Introduzca el nombre del equipo",i,":")
    equipo = input()

    equipos.append(equipo)

    goles = print(int(input("Introduzca el numero de goles del equipo"":")))
    goles = print(int(input("Introduzca el numero de goles del equipo"":")))

    resultado.append(goles)

for equipo,goles in zip (equipos,resultado):
    print(equipo[0],equipo[1])
