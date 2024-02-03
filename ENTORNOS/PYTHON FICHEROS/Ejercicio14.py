#Gonzalo Carretero Peñalosa

#Escribe un programa en python que lea el fichero json libreria.json con datos de nuestra librería y 
#muestre en la terminal cuántos libros hay en la librería.

import json

with open("libreria.json", "r") as fichero_carretero:
    libro_carretero = json.load(fichero_carretero)

libros_carretero = libro_carretero["bookstore"]["book"]
cantidad_libros_carretero = len(libros_carretero)

print(f"Hay un total de libros en la libreria de:{cantidad_libros_carretero}")