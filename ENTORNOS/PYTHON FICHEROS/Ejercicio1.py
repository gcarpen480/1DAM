#Gonzalo Carretero Peñalosa

# Escribir una función que pida un número entero entre 1 y 10 y guarde en un fichero con el nombre primer 
# apellido-n.txt la tabla de multiplicar de ese número, done n es el número introducido.

print("Introduce un numero entre 1 y 10:")
numero_carretero = int(input())

nombrefichero_carretero = 'carretero-' + str(numero_carretero) + '.txt'

with open (nombrefichero_carretero, 'w') as nombrefichero_carretero:
    for i in range(1,11):
        nombrefichero_carretero.write(str(numero_carretero) + ' x ' + str(i) + ' = ' + str(numero_carretero * i) + '\n')