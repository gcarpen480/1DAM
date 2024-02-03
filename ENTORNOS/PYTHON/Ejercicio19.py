#Escribir un algoritmo para calcular la nota final de un estudiante, 
#considerando que: por cada respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en 
#blanco 0. Imprime el resultado obtenido por el estudiante.

ejerciciosbien = int(input("Introduce la cantidad de respuesta correctas"))
ejerciciosmal = int (input("Introduce la cantidad de respuestas incorrecta"))

puntuacion = ejerciciosbien * 5 + ejerciciosmal * (-1)
print ("Puntos:",puntuacion)