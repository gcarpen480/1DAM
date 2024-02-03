Algoritmo sin_titulo
	Definir max, min, num, anterior Como Entero
	Definir respuesta Como Caracter
	Definir seguir Como Logico
	
	seguir<- Verdadero
	max<- 100
	min<-0
	anterior<-0
	
	Mientras seguir Hacer
		num<- trunc((max+min)/2)
		Si num=anterior Entonces
			num<-num+1
		FinSi
		Escribir "!!El numero es ",num,"? (=, + o -)"
		Leer respuesta
		Segun respuesta Hacer
			"-":
				max<-num
				anterior<-num
			"+":
				min<-num
				anterior<-num
			"=":
				seguir<-Falso
		FinSegun
	FinMientras
	Escribir "!! Lo he logrado mariconnnn!!"
	
FinAlgoritmo
