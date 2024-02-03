#Gonzalo Carretero
#Mostrar en pantalla los N primero número primos. Se pide por teclado la cantidad de números primos que queremos mostrar.

print("Introduzca la cantidad de numero primos a mostrar:")
numero_carretero = int(input())

contador_carretero = 0
numero1_carretero = 2

if numero_carretero > 0:
    while contador_carretero < numero_carretero:
        primo_carretero = True
        for i in range(2,numero1_carretero):
            if numero1_carretero % i == 0:
                primo_carretero = False
                break
        if primo_carretero:
            print("El numero",numero1_carretero,"es primo")
            contador_carretero = contador_carretero + 1
        numero1_carretero = numero1_carretero + 1
else:
    print("La cantidad introducida debe estar en positivo")        