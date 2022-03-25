Algoritmo Ejercicio9_7
	Dimension datos(10)
	datos(1)=10
	datos(2)=20
	datos(3)=15
	datos(4)=25
	datos(5)=30
	datos(6)=35
	datos(7)=40
	datos(8)=40
	datos(9)=50
	datos(10)=55
	Escribir "Introduzca el dato que desea buscar"
	leer n
	cont=0
	para i=1 Hasta 10 
		si n=datos(i) Entonces
			Escribir  "Se ha encontrado el valor"
			cont=cont+1
	FinSi
FinPara
Escribir "El valor aparece almacenado " cont " veces"

	
FinAlgoritmo
