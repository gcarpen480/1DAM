#Gonzalo Carretero
#Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha sacado y la menor.

lista_carretero = []

contador_carretero = int (1)
max_carretero = int (0)
min_carretero = int (0)
media_carretero = int (0)
suma_carretero = int (0)

while contador_carretero <= 5:
    notas_carretero = int(input())
    if (notas_carretero>=0) and (notas_carretero<=10):
        lista_carretero.append(notas_carretero)
        suma_carretero = suma_carretero + notas_carretero
        media_carretero = suma_carretero  / contador_carretero
        if contador_carretero == 1:
            if notas_carretero>max_carretero:
                max_carretero = notas_carretero
                min_carretero = notas_carretero
                contador_carretero = contador_carretero + 1
        else:
            if notas_carretero>max_carretero:
                max_carretero = notas_carretero
                contador_carretero = contador_carretero + 1
            if notas_carretero<min_carretero:
                min_carretero = notas_carretero 
                contador_carretero = contador_carretero + 1

print("La lista es:",lista_carretero)
print("La media es:",media_carretero) 
print("La nota maxima es:",max_carretero)
print("La nota minima es:",min_carretero)          