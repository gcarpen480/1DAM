#Gonzalo Carretero
#De una empresa de transporte se quiere guardar el nombre de los conductores que tiene, y los kilómetros que conducen cada día de la semana.

#Para guardar esta información se van a utilizar dos arreglos:

#Nombre: Lista para guardar los nombres de los conductores.
#kms: Tabla para guardar los kilómetros que realizan cada día de la semana.
#Se quiere generar una nueva lista (“total_kms”) con los kilómetros totales que realza cada conductor.

#Al finalizar se muestra la lista con los nombres de conductores y los kilómetros que ha realizado.

diasemana_carretero = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"]
nombre_carretero = []
kilometro_carretero = []
kmstotal_carretero = []
kilometros_dia_carretero = []

while True:
    print("¿Cuántos conductores tiene la empresa?:")
    numconductores_carretero = int(input())

    if numconductores_carretero > 0:
        break

for i in range(0,numconductores_carretero):
    nombre_conductor = input("Introduzca el nombre del conductor es: ")
    
    for i in range(0,7):
        kilometros_dia_carretero.append(int(input(f"Introduce los kilómetros que ha realizado en el día {diasemana_carretero[i]}: ")))

    nombre_carretero.append(nombre_conductor)
    kilometro_carretero.append(kilometros_dia_carretero)

for km in kilometro_carretero:
    total_kms_carretero = sum(km)
    kmstotal_carretero.append(total_kms_carretero)

for nombre, kms_totales in zip(nombre_carretero, kmstotal_carretero):
    print(f"{nombre} ha realizado {kms_totales} kms totales.")