Algoritmo ACT10
	Definir nota Como Entero
	Definir diez Como Logico
	diez <- Falso
	Repetir
		Escribir "Introduzca una nota"
		Leer nota
		Si nota = 10 Entonces
			diez <- Verdadero
		SiNo
		Fin Si
	Hasta Que nota = -1
	Si diez Entonces
		Escribir "Ha habido algun diez"
	SiNo
		Escribir "No ha habido ningun diez"
	Fin Si
FinAlgoritmo
