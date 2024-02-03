#Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, 
#el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres ventas que 
#realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.

venta1 = int(input("Escribe la primera venta"))
venta2 = int(input("Escribe la segunda venta"))
venta3 = int(input("Escribe la ultima venta"))

sueldo = int(input("Escribe cual es tu sueldo base"))

comision = (venta1+venta2+venta3)*0.10

print ("El sueldo base es:",sueldo)
print ("La comision del mes:",comision)
print ("El sueldo total del mes:",(sueldo + comision))