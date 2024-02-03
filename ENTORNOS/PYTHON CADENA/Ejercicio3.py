#Gonzalo Carretero
#Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuantas veces aparece el carácter en la cadena.

print("Introduzca una cadena de caracteres")
cadena_carretero = str(input())

print("Introduzca un caracter")
caracter_carretero = str(input())

contador_carretero = cadena_carretero.count(caracter_carretero)

print("El caracter",caracter_carretero,"se ha repetido tantas veces:",contador_carretero)