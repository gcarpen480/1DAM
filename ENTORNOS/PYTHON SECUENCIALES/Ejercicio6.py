#Gonzalo Carretero
#Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.

print("Introduzca un rango para mostrar cuales son los numeros pares de ese rango")
numero1_carretero = int(input())
numero2_carretero = int(input())

for i in range(numero1_carretero , numero2_carretero +1 ):
    if i% 2 == 0:
        print("El numero",i,"es par ")