#Gonzalo Carretero
#Programa que declare tres listas ‘lista1’, ‘lista2’ y ‘lista3’ de cinco enteros cada uno, pida valores para ‘lista1’ y ‘lista2’ y calcule lista3=lista1+lista2.

lista1_carretero = []
lista2_carretero = []
lista3_carretero = []

print("Escribe 5 valores para la lista 1:")
for i in range(1,6):
    lista1_carretero.append(int(input()))

print("Escribe 5 valores para la lista 2:")
for i in range(1,6):    
    lista2_carretero.append(int(input()))

for i in range (0,5):
    suma_carretero =  (lista1_carretero[i] + lista2_carretero[i])
    lista3_carretero.append(suma_carretero) 
    
print(lista3_carretero)