#Gonzalo Carretero Peñalosa

#Escribe un programa en python que lea el fichero gazpacho.json con datos su origen e ingredientes, a continuación deberá  
#crear otro fichero primerapellido_ingredientes.json con los todos los datos de sus ingredientes.


import json

ingredientes_carretero = []

with open("gazpacho.json", "r") as fichero_carretero:
    gazpacho_carretero = json.load(fichero_carretero)

    ingredientes_carretero = gazpacho_carretero["ingredientes"]

with open("carretero_ingredientes.json", "w") as fichero_carretero:
    json.dump(ingredientes_carretero, fichero_carretero , indent= 4)

