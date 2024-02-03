#Gonzalo Carretero Peñalosa

#Crear una función que calcule la temperatura media de un día a partir de la temperatura máxima y mínima. 
#Crear un programa principal, que utilizando la función anterior, vaya pidiendo la temperatura máxima y mínima de cada día y vaya mostrando la media. 
#El programa pedirá el número de días que se van a introducir.

from Funciones_Ejercicio3 import temperatura

print("Introduzca el nnumero de dias a introducir:")
dia_carretero = int(input())

for i in range(dia_carretero):
    print("Introduzca la temperatura minima del dia",i + 1,":")
    min = int(input())

    print("Introduzca la temperatura maxima del dia",i + 1,":")
    max = int(input())

    temperatura(min,max)