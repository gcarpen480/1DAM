#Gonzalo Carretero
#Escriba un programa que permita crear una lista de palabras y que, a continuación de tres opciones:

# Contar: Me pide una cadena, y me dice cuantas veces aparece en la lista
# Modificar: Me pide una cadena, y otra cadena a modificar, y modifica todas alas apariciones de la primera por la segunda en la lista.
# Eliminar: Me pide una cadena, y la elimina de la lista.
# Mostrar: Muestra la lista de cadenas
# Terminar

respuesta_carretero = int
lista_carretero = []
veces_carretero = int

print("Introduzca cuantas cadenas quieres poner dentro de la lista: ")
cantidad_carretero = int(input())

while cantidad_carretero != 0:
    print("Introduzca las",cantidad_carretero,"cadenas:")
    cadena_carretero = input()
    lista_carretero.append(cadena_carretero)
    cantidad_carretero = cantidad_carretero - 1

print("---MENU---")
print("1. Contar ")
print("2. Modificar")
print("3. Eliminar")
print("4. Mostrar")
print("5. Salir")

respuesta_carretero = int(input())

while respuesta_carretero != 5:
    if respuesta_carretero == 1:
        print("Introduzca una cadena para contar cuantas veces aparece la cadena en la lista:")
        cadena_carretero = input()
        veces_carretero = lista_carretero.append(cadena_carretero)
        print()
    if respuesta_carretero == 2:
        print("Introduzca una cadena para sustituirla por otra:")
        cadena_carretero = input ()
        print("Introduzca la cadena a sustituir:")
        sustitucion_carretero = input()
        lista_carretero = lista_carretero.append(cadena_carretero)
        print()
    if respuesta_carretero == 3:
        print("Introduzca una cadena para proceder la eliminacion:")
        cadena_carretero = input()
        lista_carretero = lista_carretero.append(cadena_carretero)
        print()
    if respuesta_carretero == 4:
        print(lista_carretero)
        print()
    
    if respuesta_carretero == 5:
        break

    print("---MENU---")
    print("1. Contar ")
    print("2. Modificar")
    print("3. Eliminar")
    print("4. Mostrar")
    print("5. Salir")
    respuesta_carretero = int(input())