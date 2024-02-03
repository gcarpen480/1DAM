Algoritmo ACT_14
	
	Definir cantidad, billeteCandidato, numBilletes Como Entero
	
	Escribir "Introduzca una cantidad en euros"
	Leer cantidad
	
	billeteCandidato<-500
	Repetir
		numBilletes<-trunc(cantidad/billeteCandidato)
		cantidad<-cantidad%billeteCandidato
		Escribir "Billetes de ",billeteCandidato," = ",numBilletes
		Segun billeteCandidato Hacer
			500:
				billeteCandidato<-200
			200:
				billeteCandidato<-100
			100:
				billeteCandidato<-50
			50:
				billeteCandidato<-20
			10:
				billeteCandidato<-5
			5: 
				billeteCandidato<-0
		FinSegun
	Hasta Que cantidad=0
FinAlgoritmo
