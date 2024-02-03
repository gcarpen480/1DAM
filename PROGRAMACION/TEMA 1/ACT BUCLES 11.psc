Algoritmo ACT11
	Definir sumaPar, sumaImpar Como Entero
	
	sumaPar <-0
	sumaImpar <-0
	Para i<-100 Hasta 200 Con Paso 1 Hacer
		Si i%2=0 Entonces
			sumaPar=sumaPar+i
		SiNo
			sumaImpar=sumaImpar+i
		FinSi
	FinPara
	Escribir "La suma de los pares es ",sumaPar," y la de los IMPARES es ",sumaImpar
FinAlgoritmo
