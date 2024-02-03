#Pide al usuario dos números y muestra la “distancia” entre ellos 
#(el valor absoluto de su diferencia, de modo que el resultado sea siempre positivo).

distancia1 = float(input("Ingrese el primer numero"))
distancia2 = float(input("Ingrese el segundo numero"))

distancia = distancia1 - distancia2
distancia = abs(distancia)

print ("La distancia entre ellos es",distancia)