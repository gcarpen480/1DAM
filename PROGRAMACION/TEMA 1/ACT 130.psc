Algoritmo sin_titulo
	Definir base Como Real
	Definir blanco, nata, nombre Como L�gico
	Escribir 'Que sabor deseas para la tarta'
	Escribir 'Tenemos Manzana, Fresa y Chocolate'
	Leer sabor
	Seg�n sabor Hacer
		"Manzana":
			precio <- 18
		"Fresa":
			precio <- 16
		"Chocolate":
			Escribir 'Quieres Chololate blanco (V) o negro (F)'
			Leer blanco
			Si blanco Entonces
				precio <- 15
			SiNo
				precio <- 14
			FinSi
		De Otro Modo:
			Escribir 'No hay existencias'
	FinSeg�n
	Escribir '�Deseas a�adir nata? (V/F)'
	Leer nata
	Si nata Entonces
		precio <- 2.50+precio
	FinSi
	Escribir '�Deseas a�adir un nombre a la tarta? (V/F)'
	Leer nombre
	Si nombre Entonces
		precio <- 2.75+precio
	FinSi
	Escribir 'El precio final de la tarta es ', precio
FinAlgoritmo
