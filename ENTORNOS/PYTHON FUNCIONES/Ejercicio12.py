#Gonzalo Carretero Peñalosa

#Vamos a mejorar el ejercicio anterior haciendo una función para validar la fecha. 
#De tal forma que al leer una fecha se asegura que es válida.

import Funciones_Ejercicio11y12

dia_carretero , mes_carretero , año_carretero = Funciones_Ejercicio11y12.LeerFecha()

print("Su día Juliano es: ",Funciones_Ejercicio11y12.Calcular_Dia_Juliano(dia_carretero,mes_carretero,año_carretero))