#Gonzalo Carretero Peñalosa

#Escribe un programa en python que lea el fichero json pedidos.json 
#con datos de órdenes, deberá mostrar en la terminal todos las órdenes de pedidos que no se hayan entregado.

import json

with open('pedidos.json', 'r') as fichero_carretero:
    pedido_carretero = json.load(fichero_carretero)

for orden_carretero in pedido_carretero['ordenes']:
    if orden_carretero['delivery'] == False:
        print(orden_carretero)
        print()
