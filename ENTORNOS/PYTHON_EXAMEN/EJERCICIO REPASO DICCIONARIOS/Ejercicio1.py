diccionario = {}

print("Introduzca un numero:")
num = int(input())

for i in range (1,num):
    diccionario[i] = i ** 2

print(diccionario)   