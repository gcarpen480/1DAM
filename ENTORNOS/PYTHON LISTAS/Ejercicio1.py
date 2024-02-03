#Gonzalo Carretero
#Realizar un programa que inicialice una lista con 10 valores aleatorios (del 1 al 10) y posteriormente muestre en pantalla cada elemento de la lista junto con su cuadrado y su cubo.

random_carretero = int
contador_carretero = int (0)

lista1_carretero = []
lista2_carretero = []
lista3_carretero = []

import random

while contador_carretero <= 10:
    contador_carretero = contador_carretero + 1
    random_carretero = random.randint(1,10)
    lista1_carretero.append(random_carretero)
    
    cuadrado_carretero = random_carretero ** 2
    lista2_carretero.append(cuadrado_carretero)

    cubo_carretero = random_carretero ** 3
    lista3_carretero.append(cubo_carretero)

print()
print("Los valores de la lista es:")
print(lista1_carretero)
print()
print("El cuadrado de los valores:")
print(lista2_carretero)
print()
print("El cubo de los valores:")
print(lista3_carretero)