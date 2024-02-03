#Gonzalo Carretero
#Escriba un programa que permita crear una lista de palabras y que, a continuación de tres opciones:

# Contar: Me pide una cadena, y me dice cuantas veces aparece en la lista
# Modificar: Me pide una cadena, y otra cadena a modificar, y modifica todas alas apariciones de la primera por la segunda en la lista.
# Eliminar: Me pide una cadena, y la elimina de la lista.
# Mostrar: Muestra la lista de cadenas
# Terminar

lista_carretero = []

print("Escribe el número de cadenas a introducir dentro de la lista: ")
cant_carretero = int(input())

print("Escribe las cadenas")
while cant_carretero != 0:
    print("Cadena", cant_carretero, ":")
    cad_carretero = input()
    lista_carretero.append(cad_carretero)
    cant_carretero = cant_carretero - 1

print("\tMENU")
print("1. Contar ")
print("2. Modificar")
print("3. Eliminar")
print("4. Mostrar")
print("5. Salir")

num_carretero = int(input())

while num_carretero != 5:
    if num_carretero == 1:
        print("Escribe una cadena para contar las veces que aparece:")
        cad_carretero = input()
        veces_carretero = lista_carretero.count(cad_carretero)
        print("Esta cadena aparece", veces_carretero, "veces en la lista")
    if num_carretero == 2:
        print("Escribe una cadena para que se cambie por otra que escribas:")
        cad_carretero = input()
        print("Escribe la cadena que vas a cambiar:")
        cambia_carretero = input()
        for i in range(len(lista_carretero)):
            if lista_carretero[i] == cad_carretero:
                lista_carretero[i] = cambia_carretero
        lista_carretero.append(cad_carretero)
        print("")
    if num_carretero == 3:
        print("Escribe una cadena para eliminar:")
        cad_carretero = input()
        for i in range(len(lista_carretero)):
            if lista_carretero[i] == cad_carretero:
                lista_carretero.pop(i)
                break
        print("La cadena se ha eliminado")
        print(lista_carretero)
    if num_carretero == 4:
        print(lista_carretero)
        print("")

    if num_carretero == 5:
        break

    print("\tMENU")
    print("1. Contar ")
    print("2. Modificar")
    print("3. Eliminar")
    print("4. Mostrar")
    print("5. Salir")
    num_carretero = int(input("\n"))
