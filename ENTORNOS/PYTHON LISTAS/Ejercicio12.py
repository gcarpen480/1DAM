#Gonzalo Carretero
#Diseñar el algoritmo correspondiente a un programa, que:

#Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco’.
#Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las posiciones o elementos que delimitan la tabla, es decir, las más externas, mientras que el resto de los elementos contendrán el valor 0.

#  111111111111111
#  100000000000001
#  100000000000001
#  100000000000001
#  111111111111111
#Visualiza el contenido de la matriz en pantalla.

num_filas_carreteroo = 5
num_cols_carretero = 15
marco_carretero = [[],[],[],[],[]]

for indice_fila in range(num_filas_carreteroo):
    fila_carretero = []
    for indice_col in range(num_cols_carretero):
        if indice_fila == 0 or indice_fila == num_filas_carreteroo - 1 or indice_col == 0 or indice_col == num_cols_carretero - 1:
            fila_carretero.append(1)  
        else:
            fila_carretero.append(0)

    marco_carretero.append(fila_carretero)


for fila in marco_carretero:
    print(*fila)