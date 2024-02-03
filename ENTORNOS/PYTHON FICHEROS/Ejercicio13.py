#Gonzalo Carretero Peñalosa

#Escribe un programa en python que lea el fichero *movies.json con datos de películas. 
#A continuación deberá crear un fichero primerapellido_peliculasaventuras.json con los títulos de las películas cuyo género incluya aventura.

import json

lista_carretero = []

with open("movies.json", "r") as ficheros_carretero:
    movies_carretero = json.load(ficheros_carretero)

    for i in movies_carretero:
        if "Adventure" in i["genres"]:
            lista_carretero.append(i["title"])

with open ("carretero_peliculasaventuras.json","w") as ficheros_carretero:
    json.dump(lista_carretero, ficheros_carretero, indent=4)


