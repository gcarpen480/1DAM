#Ejercicio16Sec

total = int(0)

print("Cuantos trabajadores tiene la empresa:")
numtrabaj = int(input())

for num in range(numtrabaj):
    print(f"Cuanto cobra el trabajador {num + 1} a la hora:")
    cobrohora = int(input())

    print(f"Cuantas horas a trabajado el trabajador {num + 1} a la semana:")
    horasemana = int(input())
    
    cobrosemanal = cobrohora * horasemana

    print(f"El trabjador {num + 1} cobra a la semana:",cobrosemanal)

    total = total + cobrosemanal

print("La empresa tendra que pagar por todos los trabajadores el precio de:",total)