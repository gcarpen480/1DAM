#Gonzalo Carretero
#Diseñar el algoritmo correspondiente a un programa, que:

#Crea una tabla (lista con dos dimensiones) de 5x5 enteros.
#Carga la tabla con valores numéricos enteros.
#Suma todos los elementos de cada fila y todos los elementos de cada columna visualizando los resultados en pantalla.

import random

tabla_carretero = []
contador_carretero = 0

for fila in range(5):
    fila_carretero = []
    for columna in range(5):
        valor_carretero = random.randint(1, 5)
        fila_carretero.append(valor_carretero)
    tabla_carretero.append(fila_carretero)

print("La lista generada es esta:\n")
for fila in tabla_carretero:
    for valor in fila:
        print(valor, end=" ")
    print()

print()

for fila_carretero in tabla_carretero:
    contador_carretero += 1
    suma_columnas_carretero = 0

    suma_filas_carretero = sum(fila)
    print(f"La suma de la fila numero {contador_carretero} es {suma_filas_carretero}", end=", ")
 
    for i in range(5):
        suma_columnas_carretero += tabla_carretero[i][contador_carretero - 1]
        print(f"y la suma de la columna numero{contador_carretero} es {suma_columnas_carretero}.")
        print()