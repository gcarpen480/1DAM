#Gonzalo Carretero
#Realizar una algoritmo que muestre la tabla de multiplicar de un número introducido por teclado.

print("Introduzca un numero para mostrar su tabla de multiplicacion correspondiente")
numero_carretero = int(input())
tabla = int

for i in range (1 , 11):
    tabla = numero_carretero * i
    print(numero_carretero,"x",i,"=",tabla)