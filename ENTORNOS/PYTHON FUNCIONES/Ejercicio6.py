#Gonzalo Carretero Peñalosa

#Diseñar una función que calcule el área y el perímetro de una circunferencia. 
#Utiliza dicha función en un programa principal que lea el radio de una circunferencia y muestre su área y perímetro.

from Funciones_Ejercicio6 import AreaPerimetro

print("Introduzca el radio de la circuferencia:")

radio_carretero = float(input())

perimetro , area = AreaPerimetro(radio_carretero)

print("El perimetro es:",perimetro)

print("El area es:",area)
