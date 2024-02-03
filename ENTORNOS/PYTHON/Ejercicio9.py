#Una tienda ofrece un descuento del 15% sobre el total de la compra y un 
#cliente desea saber cuanto deberá pagar finalmente por su compra.

precio = float(input("Introduce el total de la compra"))

descuento = precio * 0.15

print ("El total que debes de pagar:",(precio - descuento))
print ("El descuento aplicado es", descuento)