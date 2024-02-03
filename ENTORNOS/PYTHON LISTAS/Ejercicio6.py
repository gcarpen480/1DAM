#Gonzalo Carretero
#Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga cuántos días tiene 
# (por ejemplo, 30) y el nombre del mes. Debes usar listas. Para simplificarlo vamos a suponer que febrero tiene 28 días.

listadias_carretero = [31,28,31,30,31,30,31,31,30,31,30,31]

listanombre_carretero = ["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"]

print("Introduzca un mes del año:")
meses_carretero = int(input())
    
if meses_carretero >= 1 and meses_carretero <= 12:
    print("El mes introducido",listanombre_carretero[meses_carretero-1],"tiene",listadias_carretero[meses_carretero-1],"dias") #PREGUNTAT MAÑANA EN CLASE
else:
    print("Error los datos han sido mal introducidos")
