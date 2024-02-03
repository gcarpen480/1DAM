#Gonzalo Carretero
#Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se introducen por teclado.

print("Introduzca una cadena de caracteres")

cadena_carretero = str(input())

print("Introduzca una subcadena")

subcadena_carretero = str(input())

if subcadena_carretero in cadena_carretero:
    print("La subcadena pertenece a la cadena")
else:
    print("La subcadena no pertenece a la cadena")