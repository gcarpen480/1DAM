#Gonzalo Carretero
#Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el exponente. Pueden ocurrir tres cosas:
#El exponente sea positivo, sólo tienes que imprimir la potencia.
#El exponente sea 0, el resultado es 1.
#El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

import math

print ("Introduzca la base para la potencia")
base = int(input())
print ("Introduzca el exponente para la potencia")
exponente = int(input())

if exponente > 0:
    potencia = math.pow(base,exponente)
    print ("Este es el resultado de la potencia",potencia)
elif exponente == 0:
    potencia = 1
    print ("Este es el resultado de la potencia",potencia)
elif exponente < 0:
    exponente = exponente*-1
    print ("Este es el resultaado de la potencia",1/(math.pow(base,exponente)))