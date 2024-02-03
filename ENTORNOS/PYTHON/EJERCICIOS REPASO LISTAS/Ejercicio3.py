#Ejercicio 3

listamayor = []
listamenor = []
listanotas = []

notamayor = int(0)
notamenor = int(10)
sumanotas = int(0)

for i in range (1,6):
    print("Introduzca la",i,"nota")
    nota = int(input())

    if  nota >= 0 and nota <= 10:
        listanotas.append(nota)

        sumanotas = sumanotas + nota
        media = sumanotas / 5

        if nota > notamayor:
            notamayor = nota
            listamayor.append(notamayor)

        if nota < notamenor:
            notamenor = nota
            

print()

print(listamayor)
print(listamenor)
print(listanotas)
print(media)