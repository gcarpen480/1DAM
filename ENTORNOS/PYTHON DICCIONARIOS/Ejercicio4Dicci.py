#Ejercicio 4 Diccionarios

dicci = {}
lista = []

print("Cuanto alumnos vas a introducir")
cantidad = int(input())

for i in range (cantidad):
    print("Introduzca el nombre del alumno")
    nombre = input()

    if nombre in dicci:
        print("El nombre introducido ya esta dentro")

        print("Introduzca el nombre del alumno")
        nombre = input()

    print(f"Introduzca las notas del alumno {nombre}")
    
    while True:
        nota = int(input())
        if nota >= 0:

            lista.append(nota)

            media = sum(lista)/len(lista)

            dicci[nombre] = media

        else:
            break

print(dicci)