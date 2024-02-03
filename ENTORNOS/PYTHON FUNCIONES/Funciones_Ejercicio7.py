#Gonzalo Carretero Peñalosa

#Crear una subrutina llamada “Login”, que recibe un nombre de usuario y una contraseña y te devuelve Verdadero si el nombre de usuario es “usuario1” y la contraseña es “asdasd”. 
#Además recibe el número de intentos que se ha intentado hacer login y si no se ha podido hacer login incremente este valor.

#Crear un programa principal donde se pida un nombre de usuario y una contraseña y se intente hacer login, solamente tenemos tres oportunidades para intentarlo.

def login (usuario_carretero,contraseña_carretero,intentos_carretero):

    if usuario_carretero == "usuario1" and contraseña_carretero == "asdasd":
        intentos_carretero+=1
        print(f"Login Exitoso intentos realizados",intentos_carretero)
        
        return True
    
    else:
        intentos_carretero+=1
        print(f"Login fallido intentos realizados",intentos_carretero)

        return False