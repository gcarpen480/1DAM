#Ejercicio de Prueba
#Ejercicio realizado 7,18 secuenciales 8 y 9 de las listas

#Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.

import time

horas = 0
minutos = 0
segundos = 0

cont = input("Introduzca un valor que no sea un 0:")

while cont != 0:
    segundos = segundos + 1
    if segundos > 60:
        minutos = minutos + 1
        segundos = 0
        if minutos > 60:
            horas = horas + 1
            minutos = 0

    time.sleep(1)

    print(horas,":",minutos,":",segundos)