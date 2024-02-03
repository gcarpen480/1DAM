Algoritmo sin_titulo
	//Introducir números hasta que la suma sea 10000
	Definir i, total, contador, media  Como Real
	
	total<- 0
	contador <- 0
	Escribir "Introduzca una serie de numeros"
	Repetir
		Leer i
		total = total + i
		contador = contador + 1
	Hasta Que total > 10000
	
	contador = contador - 1
	media =  total/contador
	
	Escribir "Este es el total acumulado: " total
	Escribir "Estos son los numeros introducidos: " contador
	Escribir "Esta es la media final: " media
	
	
	
FinAlgoritmo
