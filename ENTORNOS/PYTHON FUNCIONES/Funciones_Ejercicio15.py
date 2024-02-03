#Gonzalo Carretero Peñalosa

#Vamos a realizar un programa similar al anterior para trabajar con una cola. 
#Una cola es una estructura de datos que nos permite guardar un conjunto de variables. 
#La característica fundamental es que el primer elemento que se añade al conjunto es el primero que se puede sacar.

#En realizada nos sirven todas las funciones del ejercicio anterior menos la función SacarDeLaCola que es la que tienes que modificar.

def LongitudCola(cola_carretero):
    return len(cola_carretero)

def EstaVaciaCola(cola_carretero):
    return len(cola_carretero) == 0

def EstaLlenaCola(cola_carretero):
    return len(cola_carretero) == len(cola_carretero)

def AddCola(cad_carretero , cola_carretero):
    return cola_carretero.append(cad_carretero)

def SacarDeLaCola (cola_carretero):
    if not EstaVaciaCola (cola_carretero):
        return cola_carretero.pop(0)
    else:
        print("La cola se encuentra vacia")
        return ""

def EscribirCola(cola_carretero):
    for elem in cola_carretero:
        print(elem,end=" ")
    
    print()