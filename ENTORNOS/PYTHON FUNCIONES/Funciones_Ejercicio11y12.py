#Gonzalo Carretero Peñalosa

#El día juliano correspondiente a una fecha es un número entero que indica los días que han transcurrido desde el 1 de enero del año indicado. Queremos crear un programa principal que al introducir una fecha nos diga el día juliano que corresponde. Para ello podemos hacer las siguientes subrutinas:

#LeerFecha: Nos permite leer por teclado una fecha (día, mes y año).
#DiasDelMes: Recibe un mes y un año y nos dice los días de ese mes en ese año.
#EsBisiesto: Recibe un año y nos dice si es bisiesto.
#Calcular_Dia_Juliano: recibe una fecha y nos devuelve el día juliano

def LeerFecha():
    dia_carretero = int(input("Dia: "))
    mes_carretero = int(input("Mes: "))
    año_carretero = int(input("Año: "))

    return dia_carretero,mes_carretero,año_carretero

def DiasDelMes(mes_carretero,año_carretero):
    
    diaMes_Carretero = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    if (año_carretero % 4 == 0 and año_carretero % 100 != 0) or (año_carretero % 400 == 0):
        diaMes_Carretero[2] = 29
        return diaMes_Carretero[mes_carretero]
    
    else:

        return diaMes_Carretero[mes_carretero]
    
def EsBisiesto(año_carretero):
    if (año_carretero % 4 == 0 and año_carretero % 100 != 0) or (año_carretero % 400 == 0):
        return print(año_carretero," es un año bisiesto")
    
    else:
        return print(año_carretero," no es un año bisiesto")

def Calcular_Dia_Juliano(dia_carretero,mes_carretero,año_carretero):
    juliano_carretero = 0

    for i in range(1 , año_carretero):
        juliano_carretero = juliano_carretero + DiasDelMes(1,i)
    juliano_carretero += dia_carretero

    return juliano_carretero

def ValidarFecha(dia_carretero,mes_carretero,año_carretero):
    if dia_carretero < 1 or dia_carretero > DiasDelMes(mes_carretero, año_carretero) or mes_carretero < 1 or mes_carretero > 12:
        return print("Fecha no valida."), False
    
    else:
        return True