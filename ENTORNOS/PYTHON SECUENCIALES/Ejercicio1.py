#GONZALO CARRETERO
#Crea una aplicación que pida un número y calcule su factorial (El factorial de un número es el producto de todos los enteros entre 1 y 
#el propio número y se representa por el número seguido de un signo de exclamación. Por ejemplo 5! = 1x2x3x4x5=120).

print("Introduzca un numero")
numero_carretero = int(input())
contadorfactorial_carretero = int()
factorial_carretero = int()

if (numero_carretero == 0) or (numero_carretero ==1):
    contadorfactorial_carretero = 1
    print(contadorfactorial_carretero)
else:
    if (numero_carretero == 1):
        contadorfactorial_carretero = 1
        print(contadorfactorial_carretero)
    else:
        contadorfactorial_carretero = 1
        factorial_carretero = numero_carretero
        while (contadorfactorial_carretero != numero_carretero):
            factorial_carretero = factorial_carretero * (numero_carretero - contadorfactorial_carretero)
            contadorfactorial_carretero = contadorfactorial_carretero + 1

print (factorial_carretero)