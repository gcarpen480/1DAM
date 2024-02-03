#Gonzalo Carretero
#Algoritmo que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos.

contador_carretero = 0
suma_carretero = float (0)
cierto = bool

print ("Introduzca una serie de numero para para introduzca un 0") 
cierto = True

while cierto == True:
    numero_carretero = float(input())
    if numero_carretero != 0:
        suma_carretero = numero_carretero + numero_carretero
        contador_carretero = contador_carretero + 1
    else:
        break
    
media_carretero = suma_carretero / contador_carretero

print ("La suma es ",suma_carretero)
print ("La media es",media_carretero)