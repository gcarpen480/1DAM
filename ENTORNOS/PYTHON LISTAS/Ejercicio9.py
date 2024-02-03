#Gonzalo Carretero
#Queremos guardar la temperatura mínima y máxima de 5 días. Realiza un programa que de la siguiente información:

#La temperatura media de cada día
#Los días con menos temperatura
#Se lee una temperatura por teclado y se muestran los días cuya temperatura máxima coincide con ella. si no existe ningún día se muestra un mensaje de información.

listamin_carretero = []
listamax_carretero = []
listamedia_carretero = []
contador_carretero = int (0)
minimodia_carretero = 0


for i in range(0,5):
    tempmin_carretero = int(input(f"Introduzca la temparatura minima {i + 1} :"))
    tempmax_carretero = int(input(f"Introduzca la temparatura minima {i + 1} :"))

    listamax_carretero.append(tempmax_carretero)
    listamin_carretero.append(tempmin_carretero)

    mediatemp_carretero = ((listamax_carretero[contador_carretero]+listamin_carretero[contador_carretero]))/2
    listamedia_carretero.append(mediatemp_carretero)
    contador_carretero = contador_carretero + 1

for i in range (0,5):
    print(f"El dia {i + 1} tiene una media de temperatura de {listamedia_carretero[i]}")
    dia_minima = listamedia_carretero.index(min(listamedia_carretero)) + 1

print()

print(f"\nEl dia que menor temperatura media es {dia_minima} con una media de {min(listamedia_carretero)}")
tempusuario_carretero = int(input("Escribe una temperatura: "))

for i in range (1,6):
    if tempusuario_carretero == listamax_carretero[i-1]:
        print("La temperatura maxima introducido coincide con el dia",i)