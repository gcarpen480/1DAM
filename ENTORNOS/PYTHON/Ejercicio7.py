#Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde.

minu = int (input("Introduzca una cantidad de minutos"))

hora = int (minu / 60)
minu = int (minu % 60)

print (hora)
print (minu)
