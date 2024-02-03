#Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica. 
#Python3 no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿Cómo se puede calcular?
print ("Introduzca un numero para realizar su raiz cuadrada y su raiz cubica")

import math

n = float(input("Introduzca un numero"))
R2 = math.sqrt(n)
R3 = n*(1/3)

print ("La raiz cuadrada es:",round(R2,3))
print ("La raiz cubica es:",round(R3,3))
