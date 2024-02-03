#Gonzalo Carretero Peñalosa

#Crea una función “calcularMaxMin” que recibe una lista con valores numéricos y devuelve el valor máximo y el mínimo. 
#Crea un programa que pida números por teclado y muestre el máximo y el mínimo, utilizando la función anterior.

from Funciones_Ejercicio5 import calcularMaxMin

print("Introduzca una lista de numero para finalizar de introducir numero introduzca un 0")
num_carretero = int(input())

longitud_carretero = int (0)
lista_carretero = []

while num_carretero != 0:
    lista_carretero.append(num_carretero)
    longitud_carretero += 1
    num_carretero = int(input())

calcularMaxMin(lista_carretero,longitud_carretero)