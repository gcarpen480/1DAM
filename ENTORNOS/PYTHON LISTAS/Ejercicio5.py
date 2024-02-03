#Gonzalo Carretero
#Hacer un programa que inicialice una lista de números con valores aleatorios (10 valores), y posterior ordene los elementos de menor a mayor.

import random
lista_carretero = []

for i in range (1,11):
    random_carretero = random.randint(1,10)
    lista_carretero.append(random_carretero)

lista_carretero.sort()

for i in lista_carretero:
         print(i," ",end="")