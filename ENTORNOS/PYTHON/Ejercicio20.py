#Diseñar un algoritmo que nos diga el dinero que tenemos 
#(en euros y céntimos) después de pedirnos cuantas monedas tenemos (de 2€, 1€, 50 céntimos, 20 céntimos o 10 céntimos).

euro1 = int(input("Introduce monedas de 1 euros:"))
euro2 = int(input("Introduce monedas de 2 euros:"))
cent50 = int(input("Introduce monedas de 50 centimos:"))
cent20 = int(input("Introduce monedas de 20 centimos:"))
cent10 = int(input("Introduce monedas de 10 centimos:"))

totaleu = euro2 * 2 + euro1
totalcent = cent50 * 50 + cent20 * 20 + cent10 * 10
totaleu = totaleu + totalcent / 100
totalcent = totalcent % 100

print (totaleu,"euros y",totalcent," centimos.")
