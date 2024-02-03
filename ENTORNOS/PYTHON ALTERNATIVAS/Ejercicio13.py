#Gonzalo Carretero
#Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta.

print("Introduzca la fecha dd/mm/aaaa")

dia = int(input())
mes = int(input())
año = int(input())

if  (mes == 1 or mes == 3 or mes == 5 or mes == 7 or mes == 8 or mes == 10 or mes == 12) and ((dia < 1) and (dia > 31)):
    print("La fecha es incorrecta")
elif (año % 4 == 0) and (mes==2) and ((dia < 1) and (dia > 29)):
    print("La fecha es incorrecta")
elif (año % 4 != 0) and (mes==2) and ((dia < 1) and (dia > 28)):
    print("La fecha introducida es correcta")
elif (mes == 4 or mes == 6 or mes == 9 or mes == 11) and ((dia < 1) and (dia > 30)):
    print("La fecha es incorrecta")