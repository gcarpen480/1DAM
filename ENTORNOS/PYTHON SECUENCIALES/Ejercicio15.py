#Gonzalo Carretero
#Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €, el segundo 20 €, el tercero 40 € y así sucesivamente. 
# Realizar un algoritmo para determinar cuánto debe pagar mensualmente y el total de
# lo que pagó después de los 20 meses.

pago_carretero = int(10)
pagototal_carretero = int(0)

for i in range (1 , 21):
    pagototal_carretero = pagototal_carretero + pago_carretero
    pago_carretero = pago_carretero * 2
    print("Este es lo que paga en el",i,"mes",pago_carretero,"€")

print ("Al final de los 20 meses pago esta cantidad:",pagototal_carretero,"€")