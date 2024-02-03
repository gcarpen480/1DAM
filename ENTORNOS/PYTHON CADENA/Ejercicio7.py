#Gonzalo Carretero
#Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del primer carácter en la cadena por el segundo carácter.

print("Introduzca una cadena de caracteres")
cadena_carretero = input()

print("Introduzca una primer caracter")
caracter1_carretero = input()

print("Introduzca una primer caracter")
caracter2_carretero = input()

while len(caracter1_carretero) != 1:
    print("Error solo puedes escribir un caracter")
    print("Introduzca una primer caracter")
    caracter1_carretero = input()
while len(caracter2_carretero) != 1:
    print("Error solo puedes escribir un caracter")
    print("Introduzca una primer caracter")
    caracter2_carretero = input()

for caracter in cadena_carretero:
    if caracter == caracter1_carretero:
        print(caracter2_carretero,end="")
    else:
        print(caracter,end="")