Algoritmo Ejercicio6
	Escribir "Introduce la cantidad total de preguntas realizadas"
	leer p
	Escribir "Introduce la cantidad de preguntas acertadas"
	leer a
	si (a>=p*90/100) Entonces
		Escribir "ENHORABUENA,su nivel es maximo"
	SiNo
		si (a>=p*75/100) y (a<p*90/100) Entonces
			Escribir "Su nivel es medio"
		SiNo
			si (a>=p*50/100) y (a<p*75/100) Entonces
				Escribir "Su nivel es regular"
			SiNo
				Escribir "Lo siento, pero esta fuera de nivel"
				FinSi
			FinSi
		FinSi
	
FinAlgoritmo
