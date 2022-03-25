Algoritmo Ejercicio3_5
	definir n Como Caracter
	Escribir "Introduzca un caracter"
	leer n
	definir m Como Caracter
	Escribir "Introduzca otro caracter"
	leer m
	definir c Como Caracter
	Escribir "introduzca otro caracter"
	leer c
	si n>c y n>m y c>m Entonces
		Escribir "El orden de mayor a menor es"    n  ,  c ,  m   
	FinSi
	si n<c y c<m y m>n Entonces
		escribir "El orden de mayor a menor es" c, m, n 
	FinSi
	
FinAlgoritmo
