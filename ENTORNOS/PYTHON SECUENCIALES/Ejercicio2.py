#Gonzalo Carretero
#Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. A continuación va pidiendo números y
#va respondiendo si el número a adivinar es mayor o menor que el introducido,a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). 
#El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el número que había generado.

import random

intentos_carretero = 0

random_carretero = random.randint(1,100)

while intentos_carretero != 11:
    intentos_carretero = intentos_carretero + 1
    print ("Introduzca un numero en el rango del 1 al 100")
    numero_carretero = int(input())
    if numero_carretero >  random_carretero:
        print("El numero es menor")
    else:
        if numero_carretero < random_carretero:
            print("El numero es mayor")
        else:
            print("Has acertado")