#Gonzalo Carretero
#Escribe un programa que lea una cadena y devuelva un diccionario con la cantidad de apariciones de cada carácter en la cadena.

print("Introduzca una cadena:")
cadena_carretero = input()

diccionario_carretero = {}

for caracter_carretero in cadena_carretero:
        if caracter_carretero in diccionario_carretero:
            diccionario_carretero[caracter_carretero] += 1
        else:
            diccionario_carretero[caracter_carretero] = 1

for caracter_carretero , cantidad_carretero in diccionario_carretero.items():
    print("El caracter",caracter_carretero,"se encuentra en la cadena tantas veces:",cantidad_carretero)
