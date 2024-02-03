frutas = {"Manzana": 2, "Pera": 4, "Banana": 5}

print("Introduzca el nombre y la cantidad de fruta a comprar para terminar de introducir frutas introduzca un valor negativo:")

lista = []

while True:

    print("Introduzca el nombre de la fruta:")
    fruta = input()

    print("Introduzca la cantidad de fruta:")
    cantidad = int(input())

    if fruta in frutas:
        valor = frutas.get(fruta)*cantidad

        lista.append(valor)

        print("Quieres añadir otra fruta (1 - SI / -1 - NO):")
        num = int(input())

        if num < 0:
            break

print(lista)