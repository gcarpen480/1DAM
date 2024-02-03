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
