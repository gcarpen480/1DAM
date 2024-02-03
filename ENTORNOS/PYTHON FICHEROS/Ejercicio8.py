#Gonzalo Carretero Peñalosa

#Escribe un programa en python que lea el fichero json colores.json con datos de colores, 
#deberá mostrar en la terminal todos los nombres de colores, sus códigos rgba y hexadecimal respectivamente.

import json

with open ("colores.json","r") as fichero_carretero:
    datos_carretero = json.load(fichero_carretero)

for color in datos_carretero["colors"]:
    nombrecolor_carretero = color["color"]
    rgba_carretero = color["code"]["rgba"]
    hexa_carretero = color["code"]["hex"]

    print(f"Nombre color: {nombrecolor_carretero}")
    print(f"RGBA: {rgba_carretero}")
    print(f"Hexadecimal: {hexa_carretero}")
    print()