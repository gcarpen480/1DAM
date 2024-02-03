#Gonzalo Carretero
#Algoritmo que muestre la tabla de multiplicar de los números 1,2,3,4 y 5.

numero_carretero = 0

for i in range (1 , 6):
    print(" ")
    print("La tabla de",i,"es:")
    print(" ")
    
    numero_carretero = numero_carretero + 1
    for i in range (1 , 10 + 1):
        resultado_carretero = numero_carretero * i
        print(numero_carretero,"x",i,"=",resultado_carretero)
    print (" ")