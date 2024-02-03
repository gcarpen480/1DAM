Algoritmo Actividad
	Definir c, v Como Entero
	Escribir '¿Cuantas horas trabajas?'
	Leer j
	Escribir '¿Cuanto cobras por hora?'
	Leer g
	Si j>35 Entonces
		g <- (j-35)*(g*1.5)+(35*g)
	SiNo
		n <- j*g
	FinSi
	Escribir 'El salario bruto es ', n
	Si n>500 Entonces
		z <- n-0
		Escribir "La Tasa del 0% es " z
	SiNo
		Si n>900 Entonces
			z <- n*0.75
			Escribir "La Tasa del 45% es " z
		SiNo
			z <- n*0.55
			Escribir "La Tasa del 25% es " z
		FinSi
	FinSi
	Escribir 'El salario neto es ', z
FinAlgoritmo
