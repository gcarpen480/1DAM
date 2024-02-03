#Gonzalo Carretero

#Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos circunferencias y las clasifique en uno de estos estados:
#exteriores,tangentes exteriores,secantes,tangentes interiores, interiores, concéntricas

print("Introduzca los puntos centrales x1,x2,y1,y2 en este mismo ordene")
x1 = int(input())
x2 = int(input())
y1 = int(input())
y2 = int(input())

print ("Introduzca los radios r1,r2")
r1 = int(input())
r2 = int(input())

distancia = ((x2-x1)**2 + (y2-y1)**2)

if distancia == 0:
    print ("Concentricas")
elif distancia > (r1 + r2):
    print ("Exteriores")
elif distancia < (r1 - r2):
    print ("Interiores")
elif distancia == (r1 + r2):
    print ("Tangentes Exteriores")
elif distancia == (r1 - r2 ):
    print ("Tangentes Interiores")
elif (distancia < (r1 + r2)) and (distancia > (r1 - r2)):
    print ("Secantes")