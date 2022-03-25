Algoritmo Ejercicio12_2
	cantdivisores=0
	Escribir "Introduce un numero"
	leer num
	para cont=1 Hasta num Hacer
		si num%cont=0 Entonces
			cantdivisores=cantdivisores+1
		FinSi
	FinPara
	Escribir "El numero " num " tiene " cantdivisores " divisores"
	
FinAlgoritmo
