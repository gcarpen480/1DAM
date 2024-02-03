#Gonzalo Carretero
#Crea una lista e inicialízala con 5 cadenas de caracteres leídas por teclado. Copia los elementos de la lista en otra lista pero en orden inverso, y muestra sus elementos por la pantalla.

lista_carretero = []


print("Introduzca 5 cadenas de caracteres:")

for i in range (0,5):
    cadena_carretero = input()
    lista_carretero.append(cadena_carretero)

lista_carretero.reverse()

print(lista_carretero)