Algoritmo Ejercicio4
	Definir n como entero
	Definir m como entero
	Escribir "Introduce la coordenada x de un punto en el plano"
	leer n
	Escribir "Introduce la coordenada y de un punto en el plano"
	leer m
	si (n>0) y (m>0) Entonces
		Escribir "Se ubica en el primer cuadrante"
	SiNo
		si (n>0) y (m<0) Entonces
			Escribir "Se ubica en el segundo cuadrante"
		SiNo
			si (n<0) y (m<0) Entonces
				Escribir "Se ubica en el tercer cuadrante"
			SiNo
			  Escribir "Se ubica en el cuarto cuadrante"
				
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
