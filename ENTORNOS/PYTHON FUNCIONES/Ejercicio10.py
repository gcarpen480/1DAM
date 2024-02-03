#Gonzalo Carretero Peñalosa

#Escribir dos funciones que permitan calcular:

#La cantidad de segundos en un tiempo dado en horas, minutos y segundos.
#La cantidad de horas, minutos y segundos de un tiempo dado en segundos.
#Escribe un programa principal con un menú donde se pueda elegir la opción de convertir a segundos, convertir a horas,minutos y segundos o salir del programa.

import Funciones_Ejercicio10


while True:
    print("1. - Convertir a segundos")
    print("2. - Convertir a horas, minutos y segundos")
    print("3. - Salir")

    respuesta_carretero = int(input())

    if respuesta_carretero == 1:
        hora_carretero = int(input("Horas: "))
        minuto_carretero = int(input("Minutos: "))
        segundos_carretero = int(input("Segundos: "))

        print(f"La cantidad de segundos son: {Funciones_Ejercicio10.Segundos_carretero(hora_carretero,minuto_carretero,segundos_carretero)}")

    elif respuesta_carretero == 2:
        segundos_carretero = int(input("Introduzca los segundos: "))

        print(f"Ha pasado {Funciones_Ejercicio10.hora_carretero(segundos_carretero)}")

    elif respuesta_carretero == 3:

        print("Hasta luego")
        break

    else:
        print("Respuesta incorrecta")
