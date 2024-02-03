#Gonzalo Carretero
#Realizar un ejemplo de menú, donde podemos escoger las distintas opciones hasta que seleccionamos la opción de “Salir”.

numero_carretero = 0

while numero_carretero != 4:
    print("MENU BODEJON")
    print("Aqui tienes la carta del bodejon")
    print("1.Aperitivos")
    print("2.Primer Plato")
    print("3.Postres")
    print("4.Salir")
    numero_carretero = int(input())

    if numero_carretero == 1:
        print("APERITIVOS:")
        print("Papas Alioli")
        print("Ensaladilla Rusa")
        print("Papas Arieras")
        print("Boquerones Fritos")
        print("Introduzca un numero para volver atras")
        numero2_carretero = int(input())
    elif numero_carretero == 2:
        print("PRIMER PLATO:")
        print("Papas con Choco")
        print("Arroz con Bacalao")
        print("Huevos roto")
        print("Solomillo en Wiskey")
        print("Introduzca un numero para volver atras")
        numero2_carretero = int(input())
    elif numero_carretero == 3:
        print("Natilla")
        print("Moouse de Chocolate")
        print("Flan")
        print("Helado")
        print("Introduzca un numero para volver atras")
        numero2_carretero = int(input())       
    