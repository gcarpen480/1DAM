#Gonzalo Carretero

#Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.

print("Cuantos numeros vas introducir")
cantidad_carretero = int(input())

negativos_carretero = 0
positivos_carretero = 0
igual_carretero = 0

print("Introduzca los numeros segun la cantidad dicha antes ")
for i in range (cantidad_carretero):
    numero_carretero = int(input())
    if numero_carretero > 0:
        positivos_carretero = positivos_carretero + 1
    elif numero_carretero < 0:
        negativos_carretero = negativos_carretero + 1
    else:
        igual_carretero = igual_carretero + 1

print (positivos_carretero)
print (negativos_carretero)
print (igual_carretero)

