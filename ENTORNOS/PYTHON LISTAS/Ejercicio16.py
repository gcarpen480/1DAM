#Gonzalo Carretero
#Vamos a crear un programa que tenga el siguiente menú:

#1. Añadir número a la lista: Me pide un número de la lista y lo añade al final de la lista.
#2. Añadir número de la lista en una posición: Me pide un número y una posición, y si la posición existe en la lista lo añade a ella (la posición se pide a partir de 1).
#3. Longitud de la lista: te muestra el número de elementos de la lista.
#4. Eliminar el último número: Muestra el último número de la lista y lo borra.
#5. Eliminar un número: Pide una posición, y si la posición existe en la lista lo borra de ella (la posición se pide a partir de 1).
#6. Contar números: Te pide un número y te dice cuantas apariciones hay en la lista.
#7. Posiciones de un número: Te pide un número y te dice en que posiciones está (contando desde 1).
#8. Mostrar números: Muestra los números de la lista
#9. Salir

menu_carretero = []

while True:
    while True:
        print("---MENU---")
        print("1. Añadir número a la lista")
        print("2. Añadir número de la lista en una posición")
        print("3. Longitud de la lista")
        print("4. Eliminar el último número")
        print("5. Eliminar un número")
        print("6. Contar números")
        print("7. Posiciones de un número")
        print("8. Mostrar números")
        print("9. Salir")
        print()

        print("Introduzca un numero para moverte por el menu:")
        num_carretero = int(input())
        
        if num_carretero > 0 or num_carretero <= 9:
            break
        else:
            print("El valor no se encuentra dentro del rango (1-9)")

    if num_carretero == 1:
        print("Introduzca un valor para añadirlo a la lista:")
        añadirnum1_carretero = int(input())
        menu_carretero(añadirnum1_carretero)
        print("Lista del menu:",menu_carretero)
    
    elif num_carretero == 2:
        print("Introduzca un valor:")
        añadirnum2_carretero = int(input())
        print("Introduzca la posicion:")
        posicion_carretero = int(input())

        if posicion_carretero <= len(menu_carretero):
            menu_carretero.append(posicion_carretero)
            print(menu_carretero)
        else:
            print("La posicion introducida no esta dentro del rango")
    
    elif num_carretero == 3:
        print("La lista tiene",len(menu_carretero),"elementos")

    elif num_carretero == 4:
        menu_carretero.pop()
        print(menu_carretero)

    elif num_carretero == 5:
        print("Introduzca un numero:")
        posicion2_carretero = int(input())

        if posicion2_carretero <= len(menu_carretero):
            menu_carretero.pop(posicion2_carretero-1)
            print(menu_carretero)
        else:
            print("La posicion introducida no existe dentro de la lista")
    
    elif num_carretero == 6:
        print("Introduzca un numero:")
        añadirnum3_carretero = int(input())
        print(menu_carretero.count(añadirnum3_carretero))

    elif num_carretero == 7:
        print("Introduzca un valor para saber su posicion:")
        posicion3_carretero = int(input())
        print(menu_carretero.index(posicion3_carretero)+1)

    elif num_carretero == 8:
        print(menu_carretero)

    elif num_carretero == 9:
        break