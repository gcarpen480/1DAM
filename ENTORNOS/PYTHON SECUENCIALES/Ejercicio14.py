#Gonzalo Carretero
#Una persona se encuentra en el kilómetro 70 de una carretera, otra se encuentra en el km 150, los coches tienen sentido opuesto y tienen la misma velocidad. Realizar un programa para determinar en qué kilómetro de esa carretera se encontrarán.

km1_carretero = int(70)
km2_carretero = int(150)

while (km1_carretero != km2_carretero):
    km1_carretero = km1_carretero + 1
    km2_carretero = km2_carretero - 1

print ("Se encuentran en el km:",km1_carretero)