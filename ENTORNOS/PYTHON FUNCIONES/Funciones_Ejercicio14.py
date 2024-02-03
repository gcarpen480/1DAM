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

def LongitudPila(pila_carretero):
    return len(pila_carretero)

def EstaVaciaPila(pila_carretero):
    return len(pila_carretero) == 0

def EstaLlenaPila(pila_carretero):
    return len(pila_carretero) == len(pila_carretero)

def AddPila(cad_carretero , pila_carretero):
    return pila_carretero.append(cad_carretero)

def SacarDeLaPila (pila_carretero):
    if not EstaVaciaPila (pila_carretero):
        return pila_carretero.pop(len(pila_carretero)-1)
    else:
        print("La pila se encuentra vacia")
        return ""

def EscribirPila(pila_carretero):
    for elem in pila_carretero:
        print(elem,end=" ")
    
    print()