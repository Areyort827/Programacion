Algoritmo Ejercicio5
	Escribir "Introduce su sueldo actual"
	leer s
	Escribir "Introduce sus años de antiguedad"
	Leer a
	si (s<500) y (a>=10) Entonces
		Escribir "Su nuevo sueldo es de " (s*20/100)+s
	SiNo
		si (s<500) y (a<10) Entonces
			Escribir "Su nuevo sueldo es de " (s*5/100)+s
		SiNo
			si (s>=500) Entonces
				Escribir "Su sueldo se mantiene en " s
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
