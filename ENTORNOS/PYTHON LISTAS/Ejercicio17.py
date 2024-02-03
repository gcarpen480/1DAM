# Gonzalo Carretero
# Crear un programa que añada números a una lista hasta que introducimos un número negativo. A continuación debe crear una nueva lista igual que la anterior pero eliminando los números duplicados. 
# Muestra esta segunda lista para comprobar que hemos eliminados los duplicados.

lista_carretero = []
numero_carretero = int
contad1r_carretero = int
contad2r_carretero = int

numero_carretero = int(input("Introduzca un numero: "))

while numero_carretero >=0:
    lista_carretero.append(numero_carretero)

    print("Introduzca un numero")
    numero_carretero = int(input())

print(lista_carretero)

for i in range(0,len(lista_carretero)):
    contad1r_carretero = i
    contad2r_carretero = i + 1
    print(contad1r_carretero)
    print(contad2r_carretero)

    for i in range (contad1r_carretero +1,len(lista_carretero)):
        if lista_carretero[contad1r_carretero] == lista_carretero [contad2r_carretero:]:
            print(contad1r_carretero)
            print(contad2r_carretero)
            contad2r_carretero = contad2r_carretero + 1

print(lista_carretero)