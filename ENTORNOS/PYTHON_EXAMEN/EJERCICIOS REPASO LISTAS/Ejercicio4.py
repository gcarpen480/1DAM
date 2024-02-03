lista = []

while True:
    print("Introduzca una serie de numero para terminar la serie introduzca un numero negativo:")
    num = int(input())

    if num >= 0:
        lista.append(num)
    
    else:
        break

print(lista)