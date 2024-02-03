#Gonzalo Carretero Peñalosa

#Vamos a realizar un programa similar al anterior para trabajar con una cola. 
#Una cola es una estructura de datos que nos permite guardar un conjunto de variables. 
#La característica fundamental es que el primer elemento que se añade al conjunto es el primero que se puede sacar.

#En realizada nos sirven todas las funciones del ejercicio anterior menos la función SacarDeLaCola que es la que tienes que modificar.

import Funciones_Ejercicio15

cola_carretero = []

while True:
    print("1.- Añadir elemento a la cola: ")
    print("2.- Sacar elemento a la cola: ")
    print("3.- Longitud de la cola: ")
    print("4.- Mostrar cola: ")
    print("5.- Salir")

    respuesta_carretero = int(input())

    if respuesta_carretero == 1:
        elemento_carretero = input("Introduzca una cadena para añadirla a la pila: ")
        Funciones_Ejercicio15.AddCola(elemento_carretero, cola_carretero)

    elif respuesta_carretero == 2:
        print(Funciones_Ejercicio15.SacarDeLaCola(cola_carretero))

    elif respuesta_carretero == 3:
        print("Longitud: ", Funciones_Ejercicio15.LongitudCola(cola_carretero))

    elif respuesta_carretero == 4:
        Funciones_Ejercicio15.EscribirCola(cola_carretero)

    elif respuesta_carretero == 5:
        print("Hasta luego")
        break

    else:
        print("El valor introducido no es correcto")