#Gonzalo Carretero Peñalosa

#Crea un función EscribirCentrado, que reciba como parámetro un texto y lo escriba centrado en pantalla 
#(suponiendo una anchura de 80 columnas; pista: deberás escribir 40 - longitud/2 espacios antes del texto). 
#Además subraya el mensaje utilizando el carácter =.

def EscribirCentrado (texto_carretero):
    huecos_carretero = " " * (40 - len(texto_carretero) // 2 )

    print(huecos_carretero + texto_carretero)
    print("")