#Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos. 
#El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. 
#Escribir un algoritmo que determine la hora de llegada a la ciudad B.

horasalida = int(input("Hora de salida"))
minsalida = int(input("Minutos de salida"))
segsalida = int(input("Segundos de salida"))
segviaje = int(input("Tiempo que has tardado en llegar expresado en segundos"))

segsalida = horasalida * 3600 + minsalida*60 + segsalida
segfinal = segsalida + segviaje

horallegada = int(segfinal / 3600)
minllegada = int(segfinal % 3600 /60)
segllegada = int(segfinal % 3600)%60

print ("Esta es la hora de llegada",horallegada,":",minllegada,":",segllegada)