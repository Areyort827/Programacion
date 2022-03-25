Algoritmo Relacion5_10
	m=0
	n=0
	Escribir "Introduce un numero" 
	leer x
	si x%2=0 Entonces
		m<-m+1
		Escribir "Numero pares: " m
	sino
	n<-n+1
		si x%2<>0 Entonces
			Escribir "Numeros impares " n
		FinSi
		finsi
	
	
	
	mientras x<>0 Hacer
		Escribir "Introduce otro numero"
		leer x
		si x%2=0 Entonces
			m<-m+1
			Escribir "Numero pares: " m
		sino
			n<-n+1
			si x%2<>0 Entonces
				Escribir "Numeros impares " n
			FinSi
		FinSi
	FinMientras
	
FinAlgoritmo
