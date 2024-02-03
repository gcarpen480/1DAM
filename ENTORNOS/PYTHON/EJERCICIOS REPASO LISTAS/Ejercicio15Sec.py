#Ejercicio15Sec
total = int(0)
multi = int(10)

for i in range(0,20):
    total = total + multi
    multi = multi * 2

    print(f"En el mes {i+1} pago",multi)

print(total)