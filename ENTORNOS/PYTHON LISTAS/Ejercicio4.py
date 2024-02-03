#Gonzalo Carretero

#Programa que declare una lista y la vaya llenando de números hasta que introduzcamos un número negativo. 
#Entonces se debe imprimir el vector (sólo los elementos introducidos).

lista_carretero = []

print("Escriba numeros:")

num_carretero = 1

while num_carretero > 0:
    num_carretero = int(input())
    if num_carretero > 0:
        lista_carretero.append(num_carretero)

print(lista_carretero)