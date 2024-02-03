#Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.

from math import sqrt

cateto1 = int (input("Introduzca un cateto del triangulo"))
cateto2 = int (input("Introduzca el otro cateto del triangulo"))

hipotenusa2 = (cateto1 ^ 2) + (cateto2 ^ 2)

hipotenusa = sqrt(hipotenusa2)

print (hipotenusa) 