#Gonzalo Carretero
#Escribe un programa python que pida un número por teclado y que cree un diccionario cuyas claves sean desde el 
# número 1 hasta el número indicado, y los valores sean los cuadrados de las claves.


print("Introduzca un numero:")
numero_carretero = int(input())

diccionario_carretero = {}

for i in range(1,numero_carretero):
    diccionario_carretero[i] = i ** 2
    print(diccionario_carretero)
