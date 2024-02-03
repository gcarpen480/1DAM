#Gonzalo Carretero
#Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella que se lee igual adelante que atrás.

print("Introduzca una cadena de caracteres")
cadena_carretero = input()

invertir_carretero = cadena_carretero[::-1]
print(invertir_carretero)

if cadena_carretero == invertir_carretero:
    print("La cadena es un palindromo")
else:
    print("La cadena no es un palindromo")