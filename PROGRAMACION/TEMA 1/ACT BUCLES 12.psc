Algoritmo ACT_12
	
	
	Definir base, exponente,potencia Como Entero
	Repetir
		Escribir "Introduce la base de la potencia:"
		Leer base
		Escribir "Introduce el exponente de la potencia:"
		Leer exponente
		Si exponente<0 Entonces
			Escribir "El exponente ha de ser positivo"
			Escribir "Pulse una tecla para continuar....."
			Leer n
			Borrar Pantalla
		FinSi
	Hasta Que exponente>=0
	
	potencia<-1
	
	Si exponente>0 Entonces
		Repetir
			potencia=potencia*base
			exponente<-exponente-1
		Hasta Que exponente=0
	FinSi
	Escribir "La potencia vale ", potencia
	
FinAlgoritmo
