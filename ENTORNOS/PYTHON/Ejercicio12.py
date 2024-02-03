#Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. 
#Calcula y muestra la distancia entre ellos.

print ("Introduzca los puntos de cada extremo")

import math

x1 = (float(input("Ingrese x1:")))
x2 = (float(input("Ingrese x2:")))
y1 = (float(input("Ingrese y1:")))
y2 = (float(input("Ingrese y2:")))

distancia = float(math.sqrt(pow(x2-x1,2)+ pow(y2-y1,2)))

print ("La distancia entre los 2 puntos es: ",distancia)