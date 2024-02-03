#Gonzalo Carretero
#Queremos guardar los nombres y la edades de los alumnos de un curso. 
#Realiza un programa que introduzca el nombre y la edad de cada alumno. 
#El proceso de lectura de datos terminará cuando se introduzca como nombre un asterisco (*) Al finalizar se mostrará los siguientes datos:

#Todos lo alumnos mayores de edad.
#Los alumnos mayores (los que tienen más edad)

lista_carretero = []
mayor_carretero = int
mayor_carretero = int (0)
contadormayor_carretero = 0

print("Introduzca el nombre del alumno:")
nombre_carretero  = input()

print("Introduzca la edad del alumno:")
edad_carretero = int(input())

while nombre_carretero != "*":
    
    if edad_carretero >= 18:
        lista_carretero.append(nombre_carretero)
    
    if  mayor_carretero <= edad_carretero:
        mayor_carretero = edad_carretero
    
    print("Introduzca el nombre del alumno:")
    nombre_carretero  = input()

    if nombre_carretero == "*":
        break

    print("Introduzca la edad del alumno:")
    edad_carretero = int(input())    

print("Estos son los alumnos mayores de edad: ",lista_carretero)
print("Esta es la edad mayor introducida: ",mayor_carretero)