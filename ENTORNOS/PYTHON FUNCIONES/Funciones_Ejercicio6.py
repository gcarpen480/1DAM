#Gonzalo Carretero Peñalosa

#Diseñar una función que calcule el área y el perímetro de una circunferencia. 
#Utiliza dicha función en un programa principal que lea el radio de una circunferencia y muestre su área y perímetro.

import math

def AreaPerimetro(r_carretero):
    perimetro_carretero = 2 * math.pi*r_carretero
    area_carretero = math.pi*(r_carretero*r_carretero)

    return perimetro_carretero, area_carretero