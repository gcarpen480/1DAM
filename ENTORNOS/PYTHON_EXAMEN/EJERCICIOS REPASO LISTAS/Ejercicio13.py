#Ejercicio13

nombretrab = []
kmdia = []
kmtotal = []
kmstotal = []

print("Cuantos transportista tiene los conductores:")
numtrabaja = int(input())

for i in range(numtrabaja):
    print("Introduzca el nombre del trabajador:")
    nombretrabaja = input()

    nombretrab.append(nombretrabaja)

    totalkm = 0
    for km in range(0,7):
        print(f"Introduzca cuanto km ha hecho en el dia {km + 1}:")
        km_dia = int(input())
 
        kmdia.append(km_dia)

        totalkm = totalkm + km_dia
        
    kmstotal.append(totalkm)

print()
for i,j in zip(nombretrab,kmstotal):
    print(f"El trabajador {i} ha realizado un total de {j} km")
print()




