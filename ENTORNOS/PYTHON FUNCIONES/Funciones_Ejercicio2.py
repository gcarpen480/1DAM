#Gonzalo Carretero Peñalosa

#Crea un programa que pida dos número enteros al usuario y diga si alguno de ellos es múltiplo del otro. 
#Crea una función EsMultiplo que reciba los dos números, y devuelve si el primero es múltiplo del segundo.

def EsMultiplo (n1,n2):
    if (n1 > n2):
        if (n1 % n2 == 0):
            print(n1,"es multiplo de",n2)
        else:
            print(n1,"no es multiplo de",n2)
    
    if (n2 > n1):
        if (n2 % n1 == 0):
            print(n2,"es multiplo de",n1)
        else:
            print(n2,"no es multiplo de",n1)