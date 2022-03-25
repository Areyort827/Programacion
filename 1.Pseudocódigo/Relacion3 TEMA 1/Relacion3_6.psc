Algoritmo Ejercicio3_6
	Escribir "Introduce un numero entre 0 y 9999"
	leer n
	si n<10 Entonces
		Escribir "El numero tiene una sola cifra"
	SiNo
		si n>=10 y n<=99 Entonces
			Escribir "El numero tiene dos cifras"
		SiNo
			si n>=100 Y N<=999 Entonces
				Escribir "El numero tiene tres cifras"
			SiNo
				si n>=1000 y n<=9999 Entonces
					Escribir "El numero tiene cuatro cifras"
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
