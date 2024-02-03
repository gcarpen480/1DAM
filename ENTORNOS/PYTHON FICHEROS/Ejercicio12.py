#Gonzalo Carretero Peñalosa

#Escribe un programa en python que lea el fichero *movies.json con datos de películas. 
#A continuación deberá crear un fichero primerapellido_pelicula1994.json con los títulos de las películas  que se hayan estrenado en 1994.

import json
lista_carretero = []

with open("movies.json", "r") as ficheros_carretero:
    movies_carretero = json.load(ficheros_carretero)

    for movie in movies_carretero:
        if movie["year"] == "1994":
            lista_carretero.append(movie["title"])

    with open("carretero_pelicula1994.json", "w") as fichero_carretero:
        json.dump(lista_carretero, fichero_carretero, indent = 4)