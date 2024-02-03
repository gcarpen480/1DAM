Algoritmo sin_titulo
	Definir n Como Entero
	Definir positivo,negativo Como Entero
	Definir nulo Como Logico
	
	nulo <- Falso
	negativo=0
	positivo=0
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Escribir "Introduzca un numero del 0 al 100"
		Leer n
		Si n < 0 Entonces
			nulo= Verdadero
			negativo= negativo+1
		SiNo
			positivo= positivo+1
		Fin Si
	Fin Para
	
	Escribir "Se ha introducido " positivo " numeros positivos"
	Escribir "Se ha introducido " negativo " numero negativos"
	
FinAlgoritmo
