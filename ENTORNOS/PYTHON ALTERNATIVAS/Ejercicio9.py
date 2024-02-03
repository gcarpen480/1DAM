#Gonzalo Carretero
#Algoritmo que pida tres números y los muestre ordenados (de mayor a menor)

print("Introduzca tres numeros")
num1 = int(input())
num2 = int(input())
num3 = int(input())

if num1 > num2:
    if num2 > num3:
        print("El mayor es",num1,"el segundo mayor es",num2,"y el ultimo es",num3,) 
    else:
        print("El mayor es",num1,"el segundo mayor es",num3,"y el ultimo es",num2,)
else:
    if num2 > num1:
        if num1 > num3:
            print("El mayor es",num2,"el segundo mayor es",num1,"y el ultimo es",num3,)
        else:
            print("El mayor es",num2,"el segundo mayor es",num3,"y el ultimo es",num1,)
    if num3 > num1:
        print("El mayor es",num3,"el segundo mayor es",num2,"y el ultimo es",num1,)
    else:
        print("El mayor es",num3,"el segundo mayor es",num1,"y el ultimo es",num2,)

