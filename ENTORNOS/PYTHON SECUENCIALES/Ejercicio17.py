#Gonzalo Carretero
#Una empresa les paga a sus empleados con base en las horas trabajadas en la semana. Para esto, se registran los días que trabajó y las horas de cada día. 
#Realice un algoritmo para determinar el sueldo semanal de N trabajadores y además calcule cuánto pagó la empresa por los N empleados.

salida_carretero = int(input("Introduzca un numero diferente a 0 para continuar"))
pagoTotal_carretero =  int(0)
trabajador_carretero = int(0)

while salida_carretero != 0:
    trabajador_carretero = trabajador_carretero + 1
    if trabajador_carretero != 0:
        print("Escribe cuantos dias trabajas a la semana")
        dia_carretero = int(input())
        print ("Introduzca las horas trabajadas al dia")
        horas_carretero = int(input())

        sueldosemana_carretero = dia_carretero * horas_carretero
        pagoTotal_carretero = pagoTotal_carretero + sueldosemana_carretero
        print("El sueldo semanal del trabajador es:",sueldosemana_carretero)
        salida_carretero = int(input("Introduzca un numero diferente a 0 para continuar"))

print("La empresa debe pagar por los empleados:",pagoTotal_carretero)        
