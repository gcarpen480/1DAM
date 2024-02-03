#Ejercicio 2

diccionario = {}

print("Introduzca una cadena:")
cadena = input()

for caracter in cadena:
    if cadena in diccionario:
        diccionario[caracter] += 1
    else:
        diccionario[caracter] = 1

for i , j in diccionario.items():
    print(i,"->",j)

