Algoritmo ACT18
	Definir clave Como Entero
	Definir i Como Entero
	
	i = 0
	clave= 1234
	Acertado = Falso
	Escribir "Introduzca la clave"
	Repetir
		Leer intento
		Si intento <> clave Entonces
			i = i + 1
			Escribir "Un intento menos"
		SiNo
			Acertado = Verdadero
		Fin Si
	Hasta Que i = 4 O clave = intento
FinAlgoritmo

