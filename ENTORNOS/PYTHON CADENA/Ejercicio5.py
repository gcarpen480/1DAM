#Gonzalo Carretero
#Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las iniciales en mayúsculas.

print("Escriba una cadena con su nombre y apellido")
cadena_carretero = str(input())

cadena_carretero = cadena_carretero.title()

for caracter_carretero in cadena_carretero:
    if caracter_carretero == caracter_carretero.upper():
        print(caracter_carretero)