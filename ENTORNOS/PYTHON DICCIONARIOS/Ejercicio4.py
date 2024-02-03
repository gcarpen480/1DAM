#Gonzalo Carretero
#Codifica un programa en python que nos permita guardar los nombres de los alumnos de una clase y las notas que han obtenido. 
# Cada alumno puede tener distinta cantidad de notas. Guarda la información en un diccionario cuya claves serán los nombres de los alumnos y los valores 
# serán listas con las notas de cada alumno.

#El programa pedirá el número de alumnos que vamos a introducir, pedirá su nombre e irá pidiendo sus notas hasta que introduzcamos un número negativo. 
# Al final el programa nos mostrará la lista de alumnos y la nota media obtenida por cada uno de ellos. 
# Nota: si se introduce el nombre de un alumno que ya existe el programa nos dará un error.

alumnado_carretero = {}
notas_carretero = []

print("Introduzca la cantidad de alumnos que se va a almacenar:")
total_carretero = int(input())

for i in range (total_carretero):
    print("Escribe el nombre del alumno:")
    alumno_carretero = input()

    while True:

        while alumno_carretero in alumnado_carretero:
            print("El alumno introducido ya existe")
            alumno_carretero = input()

        print("Introduzca una nota del alumno para terminar introduzca un valor negativo:")
        nota_carretero = int(input())

        if nota_carretero >= 0:
            notas_carretero.append(nota_carretero)

        else:
            alumnado_carretero[total_carretero] = nota_carretero
            break

    media_carretero = sum(notas_carretero)/len(notas_carretero)
    print("Nombre del alumno:",alumno_carretero)
    print("Nota media del alumno",media_carretero)
