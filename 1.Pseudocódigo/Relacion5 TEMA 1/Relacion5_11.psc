Algoritmo Relacion5_11
	pos=0
	neg=0
	cer=0
	x=0
	para i=1 Hasta 10 Hacer
		Escribir "Introduce un numero"
		leer num
		si num>0 Entonces
			x=num+x
		SiNo
			si num<0 Entonces
				x=num+x
				neg=neg+1
			SiNo
				cer=cer+1
			FinSi
		FinSi
	FinPara
	Escribir "La suma de los numeros positivos es " x
	Escribir "La media de los numeros negativos es " x/neg
	Escribir "El numero de ceros que ha introducido el usuario es " cer
	

	
	
FinAlgoritmo
