#Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
# !!Advertencia cuidado cuando se ejecute no se puede dar un espacio para colocar el nombre y los apellidos mas claro
nombre = (input("Introduce tu nombre"))
apellido1 = (input("Introduce tu primer apellido"))
apellido2 = (input("Introduce tu segundo apellido"))

inicial = nombre[0]
inicial = inicial + apellido1[0]
inicial = inicial + apellido2[0]

print ("Las iniciales son:",inicial)