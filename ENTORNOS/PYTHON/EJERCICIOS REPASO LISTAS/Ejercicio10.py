#Ejercicio 10

import random

tabla = [[],[],[],[],[]]

for fila in tabla:
    
    for i in range(5):

        num = int((random.random()*8)+1)

        fila.append(num)


for fila in tabla:

    for i in fila:

        print(i,end=" ")

    print()

print()
