Algoritmo Ejercicio9_10
	Dimension datos[3,3]
	Escribir "Introduzca los valores de su matriz"
	leer datos[1,1],datos[1,2],datos[1,3]
	Leer datos[2,1],datos[2,2],datos[2,3]
	Leer datos[3,1],datos[3,2],datos[3,3]
	Escribir "La matriz introducida es :" datos[1,1] " " datos[1,2] " " datos[1,3] 
	Escribir "                          " datos[2,1] " " datos[2,2] " " datos[2,3]
	Escribir "                          " datos[3,1] " " datos[3,2] " " datos[3,3]
	Escribir "El determinante de la matriz es " ((datos[1,1]*datos[2,2]*datos[3,3])+(datos[2,1]*datos[3,2]*datos[1,3])+(datos[1,2]*datos[2,3]*datos[3,1]))-((datos[1,3]*datos[2,2]*datos[3,1])+(datos[2,3]*datos[3,2]*datos[1,1])+(datos[1,2]*datos[2,1]*datos[3,3]))
	
FinAlgoritmo
