#Gonzalo Carretero
#Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.


print("Introduce una cadena")
cadena_carretero = str(input())

vocal_carretero = ["a","e","i","u","o"]

if cadena_carretero in vocal_carretero:
    print("Es vocal")
else:
    print ("Es consonante")

while cadena_carretero != (" "):
    cadena_carretero = str(input())
    if cadena_carretero in vocal_carretero:
        print("Es vocal")
    else:
        print ("Es consonante")