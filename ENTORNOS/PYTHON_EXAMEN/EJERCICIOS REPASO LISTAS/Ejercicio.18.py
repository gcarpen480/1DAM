#Ejercicio 15

lista = []

print("Introduzca una cadena de caracteres:")
cadena = input()

lista.append(cadena)

print("Introduzca un numero para moverte por el menu: ")

while True:
    
    print("--- MENU ---")
    print("1. Contar")
    print("2. Modificar")
    print("3. Eliminar")
    print("4. Mostrar")
    print("5. Salir")

    respuesta = int(input())

    if respuesta == 1:
        
        print("Introduzca la cadena a buscar:")

        cadena = input()

        lista.append(cadena)

        print(lista.count(cadena))

    if respuesta == 2:

        print("Introduzca una cadena a modificar:")
        cadena = input()

        print("Introduzca como deseas modificar la cadena:")
        cadena1 = input()

        lista.insert(cadena1,cadena)

    if respuesta == 3:

        print("Introduzca una cadena para eliminar de la lista:")
        cadena = input()

        lista.remove(cadena)
        
    if respuesta == 4:

        print(lista)

    if respuesta == 5:
        break    