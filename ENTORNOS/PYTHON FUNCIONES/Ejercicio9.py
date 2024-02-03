#Gonzalo Carretero Peñalosa

#Crear una función que calcule el MCD de dos número por el método de Euclides. El método de Euclides es el siguiente:

#Se divide el número mayor entre el menor.
#Si la división es exacta, el divisor es el MCD.
#Si la división no es exacta, dividimos el divisor entre el resto obtenido y se continúa de esta forma hasta obtener una división exacta, siendo el último divisor el MCD.
#Crea un programa principal que lea dos números enteros y muestre el MCD.

from Funciones_Ejercicio9 import MCD_carretero

numero1_carretero = int(input("Numero 1: "))

numero2_carretero = int(input("Numero 2: "))
print("")

resultado_carretero = MCD_carretero(numero1_carretero,numero2_carretero)

print("MCD:",resultado_carretero)