#Gonzalo Carretero Peñalosa

#El día juliano correspondiente a una fecha es un número entero que indica los días que han transcurrido desde el 1 de enero del año indicado. Queremos crear un programa principal que al introducir una fecha nos diga el día juliano que corresponde. Para ello podemos hacer las siguientes subrutinas:

#LeerFecha: Nos permite leer por teclado una fecha (día, mes y año).
#DiasDelMes: Recibe un mes y un año y nos dice los días de ese mes en ese año.
#EsBisiesto: Recibe un año y nos dice si es bisiesto.
#Calcular_Dia_Juliano: recibe una fecha y nos devuelve el día juliano.

import Funciones_Ejercicio11y12

dia_carretero , mes_carretero , año_carretero = Funciones_Ejercicio11y12.LeerFecha()

diajuliano_carretero = Funciones_Ejercicio11y12.Calcular_Dia_Juliano(dia_carretero,mes_carretero,año_carretero)

print(f"Su día Juliano es: {diajuliano_carretero}")