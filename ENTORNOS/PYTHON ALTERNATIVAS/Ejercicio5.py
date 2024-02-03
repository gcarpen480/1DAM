#Gonzalo Carretero
#Escribe un programa que pida un nombre de usuario y una contraseña y si se ha introducido “pepe” y “asdasd” se indica “Has entrado al sistema”, sino se da un error.

nombre = str(input("Introduzca su nombre de usuario"))
contraseña = str(input("Introduzca su contraseña de acceso"))
usuario = "pepe"
passwd = "asdasd"

if nombre == usuario:
    if contraseña == passwd:
        print ("Has entrado en el sistema")
else:
    print ("Los datos introducidos son incorrectos")
