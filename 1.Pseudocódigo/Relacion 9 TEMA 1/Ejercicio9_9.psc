Algoritmo Ejercicio9_9
	Dimension datos[2,2]
	Escribir "Introduce los valores de la matriz"
	Para i=1 Hasta 1
		leer datos[i,1]
		Leer datos[i,2]
	FinPara
	Para u=1 hasta 2
		Leer datos[2,u]
		
	FinPara
	Escribir "La matriz es :" datos[1,1] "   "  datos[1,2]
	Escribir "             " datos[2,1] "   "  datos[2,2]
	Escribir "El determinante de la matriz es " (datos[1,1]*datos[2,2])-(datos[1,2]*datos[2,1])
FinAlgoritmo
