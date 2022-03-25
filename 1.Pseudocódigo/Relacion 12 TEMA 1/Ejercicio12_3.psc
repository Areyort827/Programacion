
Algoritmo  Ejercicio12_3
	Escribir "Introduce dos numeros enteros"
	leer m
	leer n
	si m%n=0 Entonces
		mult=m
	sino	
		si n%m=0 Entonces
			mult=n
		sino mult=0
		FinSi
	finsi
	Escribir mult " es multiplo del otro parametro"
	
FinAlgoritmo



