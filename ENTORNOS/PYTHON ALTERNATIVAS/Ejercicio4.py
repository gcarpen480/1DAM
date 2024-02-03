#Gonzalo Carretero
#Crea un programa que pida al usuario dos números y muestre su división si el segundo no es cero, o un mensaje de aviso en caso contrario.

print("Introduzca 2 numeros:")
num1 = int(input())
num2 = int(input())

if num2 == 0:
    print("NO SE PUEDE REALIZAR LA DIVISION")
else:
    print("SE PUEDE REALIZAR LA DIVISION")
    print("Este es el resultado de la division",num1/num2) 