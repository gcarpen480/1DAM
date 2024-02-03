#Ejercicio5
agenda = {}

while True:

    print()

    print("--- AGENDA ---")
    print("1.--- AÑADIR / MODIFICAR ---")
    print("2.--- BUSCAR ---")
    print("3.--- BORRAR ---")
    print("4.--- LISTAR ---")

    print()
    
    print("Introduzca un numero para moverte por el menu:")
    respuesta = int(input())

    if respuesta == 1:
        print("Introduzca un nombre para añadirlo a la agenda o modificarlo:")
        nombre = input()
        
        if nombre not in agenda:
            print("Introduzca el numero de telefono del nombre introducido:")
            telefono = int(input())

            agenda[nombre] = telefono

        else:
            print("El nombre introducido ya se encuentra creado , deseas modificar algun contacto")
            respuesta = input()

            if respuesta == 'si':
                print("Introduzca el nuevo numero de telefono:")
                telefono = int(input())

                agenda[nombre] = telefono
    
    if respuesta == 2:
        print("Introduzca una cadena para buscarlas")
        cadena = input()

        for valor in agenda.values():
            if valor.startswith(cadena):
                print(nombre)

    if respuesta == 3:
        print("Introduzca un nombre:")
        nombre = input()

        if nombre in agenda:
            print("Deseas eliminar el nombre introducido en la agenda:")
            respuesta = input()

            if respuesta == 'si':
                agenda.pop(nombre)
    
    if respuesta == 4:
        print(agenda)

    if respuesta == 5:
        break
