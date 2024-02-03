#Gonzalo Carretero Peñalosa

#Vamos a crear un programa para trabajar con una pila. Una pila es una estructura de datos que nos permite guardar un conjunto de variables. La característica fundamental es que el último elemento que se añade al conjunto es el primero que se puede sacar.

#Para representar una pila vamos a utilizar una lista de cadenas de caracteres.

#Vamos a crear varias funciones para trabajar con la pila:

#LongitudPila: Función que recibe una pila y devuelve el número de elementos que tiene.
#EstaVaciaPila: Función que recibe una pila y que devuelve si la pila está vacía, no tiene elementos.
#EstaLlenaPila: Función que recibe una pila y que devuelve si la pila está llena.
#AddPila: función que recibe una cadena de caracteres y una pila, y añade la cadena a la pila, si no está llena. si esta llena muestra un mensaje de error.
#SacarDeLaPila: Función que recibe una pila y devuelve el último elemento añadido y lo borra de la pila. Si la pila está vacía muestra un mensaje de error.
#EscribirPila: Función que recibe una pila y muestra en pantalla los elementos de la pila.
#Realiza un programa principal que nos permita usar las funciones anterior, que nos muestre un menú, con las siguientes opciones:

#Añadir elemento a la pila
#Sacar elemento de la pila
#Longitud de la pila
#Mostrar pila
#Salir

import Funciones_Ejercicio14

pila_carretero = []

while True:
    print("1.- Añadir elemento a la pila: ")
    print("2.- Sacar elemento a la pila: ")
    print("3.- Longitud de la pila: ")
    print("4.- Mostrar pila: ")
    print("5.- Salir")

    respuesta_carretero = int(input())

    if respuesta_carretero == 1:
        elemento_carretero = input("Introduzca una cadena para añadirla a la pila: ")
        Funciones_Ejercicio14.AddPila(elemento_carretero, pila_carretero)

    elif respuesta_carretero == 2:
        print(Funciones_Ejercicio14.SacarDeLaPila(pila_carretero))

    elif respuesta_carretero == 3:
        print("Longitud: ", Funciones_Ejercicio14.LongitudPila(pila_carretero))

    elif respuesta_carretero == 4:
        Funciones_Ejercicio14.EscribirPila(pila_carretero)

    elif respuesta_carretero == 5:
        print("Hasta luego")
        break

    else:
        print("El valor introducido no es correcto")