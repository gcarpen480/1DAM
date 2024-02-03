#Gonzalo Carretero
#Vamos a crear un programa en python donde vamos a declarar un diccionario para guardar los precios de las distintas frutas. 
# El programa pedirá el nombre de la fruta y la cantidad que se ha vendido y nos mostrará el precio final de la fruta a partir de los datos guardados en el diccionario. Si la fruta no existe nos dará un error. 
# Tras cada consulta el programa nos preguntará si queremos hacer otra consulta.

diccionario_carretero = {}
diccionario_carretero ["Manzana"] = 2
diccionario_carretero ["Pera"] = 1
diccionario_carretero ["Banana"] = 0,50
diccionario_carretero ["Melon"] = 5
diccionario_carretero ["Sandia"] = 10

contador_carretero = int(0)
contador1_carretero = int(0)
precio_carretero = int(0)

print("Introduzca el nombre de la fruta:")
fruta_carretero = input()

print("Introduzca la cantidad de fruta:")
cantidad_carretero = int(input())

if fruta_carretero in diccionario_carretero:
    for clave in diccionario_carretero.keys():
        contador_carretero = contador_carretero + 1
        if clave == fruta_carretero:
            break
    for clave in diccionario_carretero.values():
        contador1_carretero = contador1_carretero + 1
        if contador1_carretero == contador_carretero:
           precio_carretero = clave 
    print("El precio total de la fruta es:",precio_carretero*cantidad_carretero,"€")
else:
    print("Se ha producido un error")
