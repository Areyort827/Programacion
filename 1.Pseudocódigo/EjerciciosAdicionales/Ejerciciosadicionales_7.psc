Algoritmo Ejerciciosadicionales_7
	Escribir "Introduce un numero de hasta dos cifras"
	leer n
 rest=0
	Si n<10 Entonces
		rest=10-n
		Escribir "Le faltan " rest " unidades para llegar a 2 cifras"
	SiNo
		rest=100-n
		Escribir "Le faltan " rest " unidades para llegar a 3 cifras"
	FinSi
FinAlgoritmo
