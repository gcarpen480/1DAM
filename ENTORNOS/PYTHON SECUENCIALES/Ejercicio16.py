#Gonzalo Carretero
#Una empresa les paga a sus empleados con base en las horas trabajadas en la semana. Realice un algoritmo para determinar el 
# sueldo semanal de N trabajadores y, además, calcule cuánto pagó la empresa por los N empleados.

salida_carretero = int(input("Introduzca un numero diferente a 0 para continuar"))
pagoTotal_carretero =  int(0)
trabajador_carretero = int(0)
while salida_carretero != 0:
    trabajador_carretero = trabajador_carretero + 1

    print("Introduzca las horas trabajadas")
    horas_carretero = int(input())

    print ("Cuanto cobran a la hora:")
    sueldohora_carretero = float(input())

    sueldo_carretero = 6 * (sueldohora_carretero * horas_carretero)

    print("El sueldo del trabajador",trabajador_carretero,"es de:",sueldo_carretero)
    pagoTotal_carretero = pagoTotal_carretero + sueldo_carretero
    salida_carretero = int(input("Introduzca un numero diferente a 0 para continuar"))
print ("La empresa debera de pagar en total por",trabajador_carretero,"trabajadores",pagoTotal_carretero)