#Gonzalo Carretero
#Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena introducida por teclado.

print("Introduzca una cadena de caracteres")

cadena_carretero = str(input())

print("Introduzca una subcadena")

subcadena_carretero = str(input())

if cadena_carretero.startswith(subcadena_carretero):
    print("La subcadena empieza a la cadena")
else:
    print("La subcadena no empieza a la cadena")