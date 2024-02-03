#Gonzalo Carretero

#Escribir un programa que implemente una agenda. En la agenda se podrán guardar nombres y números de teléfono. El programa nos dará el siguiente menú:

#Añadir/modificar: Nos pide un nombre. Si el nombre se encuentra en la agenda, debe mostrar el teléfono y, opcionalmente, permitir modificarlo si no es correcto. Si el nombre no se encuentra, debe permitir ingresar el teléfono correspondiente.
#Buscar: Nos pide una cadena de caracteres, y nos muestras todos los contactos cuyos nombres comiencen por dicha cadena.
#Borrar: Nos pide un nombre y si existe nos preguntará si queremos borrarlo de la agenda.
#Listar: Nos muestra todos los contactos de la agenda.
#Implementar el programa con un diccionario.

Agenda_carretero = {}

while True:
    print()
    print("--- MENU ---")
    print("1. Añadir/Modificar")
    print("2. Buscar")
    print("3. Borrar")
    print("4. Listar")
    print("5. Salir de la Agenda")

    print("Elige una opcion del menu:")
    respuesta_carretero = int(input())

    if respuesta_carretero == 1:
        nombre_carretero = input()
        if nombre_carretero in Agenda_carretero:
            print("El número de teléfono asignado a", nombre_carretero, "es", Agenda_carretero[nombre_carretero])
            print("¿Deseas cambiar el numero de telefono? Introduzca (1 = Si o 2 = No): ")
            modificar_carretero = int(input())
            if modificar_carretero == 1:
                telefono_carretero = input("Introduzca el nuevo numero de telefono para asignarlo:")
                Agenda_carretero[nombre_carretero] = telefono_carretero
                print("El número de teléfono que se a asignado a", nombre_carretero, "es", Agenda_carretero[nombre_carretero])
            
        else:
            print("El contacto introducido no está registrado")
            print("Introduzca el número de teléfono que se asignara a",nombre_carretero,":")
            telefono_carretero = int(input())
            Agenda_carretero[nombre_carretero] = telefono_carretero
            print("El contacto",nombre_carretero,"ha sido agregado a la agenda")

    elif respuesta_carretero == 2:
        print("Introduzca una cadena para buscarla en tu agenda:")
        cadena_carretero = input()

        for nombre_carretero in Agenda_carretero:
            if  nombre_carretero.startswith(cadena_carretero):
                print("Nombre:",nombre_carretero)
                print("Telefono movil:",Agenda_carretero[nombre_carretero])

    elif respuesta_carretero == 3:
        print("Introduzca el nombre del contacto:")
        nombre_carretero = input()

        if nombre_carretero in Agenda_carretero:
            opcion_carretero = input("Introduzca 1 si quieres borrarlo si no quieres borrarlo introduzca 2:")
            if opcion_carretero == "1":
                del Agenda_carretero[nombre_carretero]
                print(nombre_carretero, "El contacto ha sido eliminado")
        else:
            print("El contacto introducido",nombre_carretero," no esta en la agenda")

    elif respuesta_carretero == 4:
        if Agenda_carretero.keys():
            print("Contacto almacenados en la agenda:")
            for nombre_carretero, telefono_carretero in Agenda_carretero.items():
                print(nombre_carretero,"->",telefono_carretero) 

    elif respuesta_carretero == 5:
        break

    else:
        print("La agenda se encuentra vacia")
       

