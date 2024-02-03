Algoritmo ACTIVIDAD
	Definir hh, mm, ss Como Entero
	Escribir 'Escribe la hora como se expresa hh,mm,ss'
	Leer z
	Leer a
	Leer x
	Si x>=59 Entonces
		x <- 0
		Si a>=59 Entonces
			a <- 0
			Si z>=2312 Entonces
				z <- 0
			SiNo
				z <- z+1
			FinSi
		SiNo
			a <- a+1
		FinSi
	SiNo
		x <- x+1
	FinSi
	Escribir 'Tras un segundo son las ', z, ':', a, ':', x
FinAlgoritmo
