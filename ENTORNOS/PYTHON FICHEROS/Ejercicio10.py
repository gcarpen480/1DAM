#Gonzalo Carretero Peñalosa

#Escribe un programa en python que lea el fichero json pedidos.json con datos de ordenes, a continuación deberá 
#crear otro fichero primerapellido_clientes.json con los todos los datos de los clientes.

import json

cliente_carretero = []

with open('pedidos.json', 'r') as fichero_carretero:
    pedido_carretero = json.load(fichero_carretero)

for i in pedido_carretero["ordenes"]:
    cliente_carretero.append(i["cliente"])

with open('carretero_clientes.json', 'w') as fichero_carretero:
    json.dump(cliente_carretero, fichero_carretero,indent=4)
