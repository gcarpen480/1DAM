
diccionario = {}
notas = []

print("Introduzca cuanto alumnos vas a tener nota")

cantidad = int(input())

for i in range(cantidad):
    print("Introduzca el nombre del alumno:")
    nombre = input()
 
    print("Introduzca la nota del alumno")
    
    while True:
        nota = int(input())
        if nota >= 0 and nota <= 10:
            notas.append(nota)
        else:
             print("Nota introducida fuera del rango")
             break

    notamedia = sum(notas)/len(notas)
    print("Nombre del alumno:",nombre, "\n Nota media del alumno:",notamedia)

