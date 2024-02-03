#Gonzalo Carretero
#Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.

import time

horas_carretero = 0
minutos_carretero = 0
segundos_carretero = 0

empieze_carretero = input("Introduzca un valor que no sea 0")

while empieze_carretero != 0:
    segundos_carretero = segundos_carretero + 1
    if segundos_carretero == 60:
        segundos_carretero = 0
        minutos_carretero = minutos_carretero + 1
        if minutos_carretero == 60:
            minutos_carretero = 0
            horas_carretero = horas_carretero + 1

    time.sleep(1)
    print (horas_carretero,":",minutos_carretero,":",segundos_carretero)