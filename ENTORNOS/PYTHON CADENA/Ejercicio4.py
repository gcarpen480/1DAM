#Gonzalo Carretero
#Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.

print("Introduzca una cadena en una frase")
cadena_carretero = str(input())

contador_carretero = cadena_carretero.split()
numero_carretero = len(contador_carretero)

print("Hay tantas palabras",numero_carretero)