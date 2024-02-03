#Gonzalo Carretero
#Una empresa tiene el registro de las horas que trabaja diariamente un empleado durante la semana (seis días) y 
# requiere determinar el total de éstas, así como el sueldo que recibirá por las horas trabajadas.

print("Introduzca cuanto cobra a la hora")
salariohora_carretero = int (input())

dia_carretero = int (1)
diastrabajado_carretero = int (1)
totalhoras_carretero = int(0)

print("Introduzca las horas trabajadas al dia")
horas_carretero = int(input())

while dia_carretero <= 6:
    if  horas_carretero > 0:
        dia_carretero = dia_carretero + 1
else:
    print("Debe de introducir el numero en positivo")

totalhoras_carretero = horas_carretero * diastrabajado_carretero
sueldo_carretero = horas_carretero * salariohora_carretero
sueldo_carretero = sueldo_carretero * diastrabajado_carretero

print(sueldo_carretero)
print(totalhoras_carretero)

