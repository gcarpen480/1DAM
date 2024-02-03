#Gonzalo Carretero Peñalosa

#Escribe un programa en python que lea el fichero json libreria.json con datos de nuestra librería, 
#recibe por teclado un límite inferior y superior para el precio y muestre en la terminal todos los libros cuyo precio esta en ese intervalo.

import json

with open('libreria.json', 'r') as fichero_carretero:
    libreria_carretero = json.load(fichero_carretero)
    libros_carretero = libreria_carretero['bookstore']['book']

print("Introduce el límite inferior de precio:")
limiteinferior_carretero = float(input())

print("Introduce el límite superior de precio:")
limitesuperior_carretero = float(input())

for libro_carretero in libros_carretero:
    precio = float(libro_carretero['price'])
    
    if limiteinferior_carretero <= precio <= limitesuperior_carretero:
        print()
        print(libro_carretero)
