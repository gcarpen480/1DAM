#Gonzalo Carretero
#Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.

print("Escriba la base de la potencia")
base_carretero = int(input())

print("Escriba el exponente de la potencia")
exponente_carretero = int(input())

potencia_carretero = 1

for i in range (1 , exponente_carretero + 1):
    potencia_carretero = potencia_carretero * base_carretero

print("El resultado de la potencia es:",potencia_carretero)