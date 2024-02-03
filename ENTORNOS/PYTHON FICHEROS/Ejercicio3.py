#Ejercicio 3

#Escribir una función que pida dos números n y m entre 1 y 10, lea el fichero primerapellido-n.txt con la tabla de multiplicar de ese número, y muestre 
#por pantalla la línea m del fichero. Si el fichero no existe debe mostrar un mensaje por pantalla informando de ello.

contador = int(1)

print("Introduzca un numero entre 1 y 10:")

numero_carretero = int(input())

print("Introduzca un numero entre 1 y 10:")

m_carretero = int(input())

nombrefichero_carretero = 'carretero-' + str(numero_carretero) + '.txt'

with open (nombrefichero_carretero, "r") as nombrefichero_carretero:

    for i in nombrefichero_carretero:
        
        if contador == m_carretero:
            print(i)
        contador = contador + 1