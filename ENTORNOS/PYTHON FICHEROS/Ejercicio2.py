#Gonzalo Carretero Peñalosa

#Escribir una función que pida un número entero entre 1 y 10, lea el fichero primerapellido-n.txt con la tabla de multiplicar de ese número, 
#done n es el número introducido, y la muestre por pantalla. Si el fichero no existe debe mostrar un mensaje por pantalla informando de ello.

print("Introduce un numero entre 1 y 10:")
numero_carretero = int(input())

nombrefichero_carretero = 'carretero-' + str(numero_carretero) + '.txt'

with open (nombrefichero_carretero, 'r') as nombrefichero_carretero:
    
    for i in nombrefichero_carretero:
        print(i)
       