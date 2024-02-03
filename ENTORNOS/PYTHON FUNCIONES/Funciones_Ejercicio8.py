#Gonzalo Carretero Peñalosa

#Crear una función recursiva que permita calcular el factorial de un número. Realiza un programa principal donde se lea un 
#entero y se muestre el resultado del factorial.

def factorial_carretero (num_carretero):
    if num_carretero == 0:
        return 1
    else:
        return num_carretero * factorial_carretero(num_carretero - 1)