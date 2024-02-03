#Gonzalo Carretero Peñalosa

#Escribir dos funciones que permitan calcular:

#La cantidad de segundos en un tiempo dado en horas, minutos y segundos.
#La cantidad de horas, minutos y segundos de un tiempo dado en segundos.
#Escribe un programa principal con un menú donde se pueda elegir la opción de convertir a segundos, convertir a horas,minutos y segundos o salir del programa.

def Segundos_carretero(h_carretero,m_carretero,s_carretero):
    return h_carretero * 3600 + m_carretero * 60 + s_carretero

def hora_carretero (seg_carretero):

    hora_carretero = seg_carretero / 3600
    min_carretero = (seg_carretero % 3600) / 60
    segs_carretero = (seg_carretero % 3600) % 60

    return hora_carretero, min_carretero , segs_carretero