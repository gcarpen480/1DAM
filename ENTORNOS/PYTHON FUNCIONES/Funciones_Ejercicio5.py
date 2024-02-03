#Gonzalo Carretero Peñalosa

#Crea una función “calcularMaxMin” que recibe una lista con valores numéricos y devuelve el valor máximo y el mínimo. 
#Crea un programa que pida números por teclado y muestre el máximo y el mínimo, utilizando la función anterior.

def calcularMaxMin (lista_carretero, longitud_carretero):

    max_carretero = int(0)
    min_carretero = int(0)

    for i in range(1,longitud_carretero):
        if lista_carretero[i] > max_carretero:
            max_carretero = lista_carretero[i]
        
        if lista_carretero[i] < min_carretero:
            min_carretero = lista_carretero[i]

    print("El numero mayor es",max_carretero)
    print("El numero menor es",min_carretero)
    