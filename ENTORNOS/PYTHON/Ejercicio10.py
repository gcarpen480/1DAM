#Un alumno desea saber cual será su calificación final en la materia de Algoritmos. 
#Dicha calificación se compone de los siguientes porcentajes:
#55% del promedio de sus tres calificaciones parciales.
#30% de la calificación del examen final.
#15% de la calificación de un trabajo final.

print ("Escribe las notas de los parciales para saber su calificacion final")
nota1 = float (input())
nota2 = float (input())
nota3 = float (input())

media = (nota1 + nota2 + nota3) / 3
media = media*0.55

notafinal = float(input("Escribe la calificacion del examen final"))
notafinal = notafinal*0.30

notatrabajo = float(input("Escribe la calificacion del trabajo final"))
notatrabajo = notatrabajo*0.15

print ("El promedio de las 3 clasificaciones parciales con un 55 es: ",media)
print ("La calificacion del examen con un 30 por ciento es: ",notafinal)
print ("La calificacion del trabajo final con un 15 por ciento es: ",notatrabajo)