#Gonzalo Carretero
#Escribe un programa que diga si un número introducido por teclado es o no primo. 
# Un número primo es aquel que sólo es divisible entre él mismo y la unidad. Nota: Es suficiente probar hasta la raíz cuadrada del número para ver si es divisible por algún otro número.

import math

print("Escribe un numero")
numero_carretero = int(input())
raiz_carretero = int(math.sqrt(numero_carretero))

primo_carretero = True

for i_carretero in range (2,raiz_carretero+1):
    if numero_carretero % i_carretero == 0:
        primo_carretero = False

if primo_carretero:
    print("Es primo")
else:
    print("No es primo")