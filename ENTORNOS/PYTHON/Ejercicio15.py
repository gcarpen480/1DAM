#Dadas dos variables numéricas A y B, que el usuario debe teclear, 
#se pide realizar un algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.

nA =int (input("Ingrese un numero de A cifras"))
nB =int (input("Ingrese un numero de B cifras"))

n0 = nA
nA = nB
nB = n0

print ("El numero A es:",nA)
print ("El numero B es:",nB)