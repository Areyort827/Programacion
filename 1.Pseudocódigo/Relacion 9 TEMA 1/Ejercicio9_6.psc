Algoritmo Ejercicio9_6
	Dimension datos(7)
	n=0
	para i=1 Hasta 7 con paso 1 
		Escribir "Introduzca un valor"
		Leer datos(i)
	FinPara
	mayor=datos(1)
    para i=2 Hasta 7
		si datos(i)>mayor Entonces
			mayor=datos(i)
		FinSi
	FinPara
	Escribir "El valor mas alto es " mayor
FinAlgoritmo
