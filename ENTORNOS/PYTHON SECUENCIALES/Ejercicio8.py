#Gonzalo Carretero
#Escribe un programa que pida el limite inferior y superior de un intervalo. Si el límite inferior es mayor que el superior lo tiene que volver a pedir.
#A continuación se van introduciendo números hasta que introduzcamos el 0. Cuando termine el programa dará las siguientes informaciones:
#La suma de los números que están dentro del intervalo (intervalo abierto).
#Cuantos números están fuera del intervalo.
#He informa si hemos introducido algún número igual a los límites del intervalo.

Verdadero_carretero = bool (True)
suma_carretero = int (0)
outrango_carretero = int (0)
igualrango_carretero = int (0)

print ("Escribe un numero para que sea el limite inferior del rango")
numero1_carretero = int(input())

while Verdadero_carretero == True:
        print("Escribe un numero para que sea el limite superior del rango")
        numero2_carretero = int(input())
        if numero2_carretero > numero1_carretero:
            Verdadero_carretero == False
            break
        else:
            print("El numero",numero1_carretero,"es mayor que el otro extremo del rango",numero2_carretero,)
            print("")
for i in range (numero1_carretero, numero2_carretero + 1):
    print (i)
    suma_carretero = suma_carretero + i
while Verdadero_carretero == True:
    print("Introduzca una relacion de numeros para salir escriba un 0")
    numero_carretero = int(input())
    if numero_carretero == 0:
        Verdadero_carretero = False
    elif numero_carretero < numero1_carretero:
        outrango_carretero = outrango_carretero + 1
    elif numero_carretero > numero2_carretero:
        outrango_carretero = outrango_carretero + 1
    elif numero_carretero == numero1_carretero:
        igualrango_carretero = igualrango_carretero + 1
    elif numero_carretero == numero2_carretero:
        igualrango_carretero = igualrango_carretero + 1

print("La suma de los numeros dentro del rango",suma_carretero)
print("Numeros introducidos fuera del rango",outrango_carretero)
print("Numeros igual al numero del rango",igualrango_carretero)