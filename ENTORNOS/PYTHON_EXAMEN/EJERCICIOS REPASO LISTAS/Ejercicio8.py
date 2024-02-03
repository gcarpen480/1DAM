#Ejercicio 8
listanombre = []
listaedad = []

while True:

    print("Introduzca el nombre del alumno")
    nombre = input()

    if nombre != '*':
        listanombre.append(nombre)
    else:
        break

    print("Introduzca la edad del alumno")
    edad = int(input())

    if edad >= 18:
        listaedad.append(nombre)
    else:
        print("El alumno no es mayor de edad")

print(listaedad)
print("El alumno con mas edad es",max(listaedad))  
