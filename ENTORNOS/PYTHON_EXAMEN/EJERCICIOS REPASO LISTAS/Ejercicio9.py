#Ejercicio 9

listatemp = []
listatempmax = []
listatempmin = []
listamedia = []
dia = int(0)

for i in range (1,3):
    i = dia
    print("Introduzca la temperatura minima del",i,"dia:")
    tempmini = int(input())
    listatempmin.append(tempmini)

    print("Introduzca la temperatura maxima del",i,"dia:")
    tempmax = int(input())
    listatempmax.append(tempmax)

    media = (tempmini + tempmax) / 2

    listamedia.append(media)

    print("La temperatura media del dia",i,"es de:",media)
    print()

print("La temperatura mas baja de los 5 dias es del dia con la minima de:",min(listatempmin))
print()

print("Introduzca una temperatura please:")
temperatura = int(input())

for i in listatempmax:
    if temperatura == max(listatempmax):
        print(f"La temperatrua maxima introducida coincide con la del dia",{i})
        break
    else:
        print("No se encuentra la tempertura introducida")





