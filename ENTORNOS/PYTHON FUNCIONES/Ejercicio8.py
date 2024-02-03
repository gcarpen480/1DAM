#Gonzalo Carretero Peñalosa

#Crear una función recursiva que permita calcular el factorial de un número. Realiza un programa principal donde se lea un 
#entero y se muestre el resultado del factorial.

from Funciones_Ejercicio8 import factorial_carretero

num_carretero = int(input("Introduzca un numero entero no negativo: "))

if num_carretero > 0:

    resultado_carretero = factorial_carretero(num_carretero)

    print("El factorial de", num_carretero, "es",resultado_carretero)

else:
    print("El numero introducido no puede ser un numero negativo")