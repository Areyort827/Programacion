Algoritmo Ejercicio9_3
	Escribir "Escribe 5 datos"
	leer n,m,c,j,a
	Dimension datos(5)
	datos(1)=n
	datos(2)=m
	datos(3)=c
	datos(4)=j
	datos(5)=a
	Escribir "La media de los datos son " (datos(1)+datos(2)+datos(3)+datos(4)+datos(5))/5
	Escribir "Los datos por encima de la media son"
	para i=1 Hasta 5 Hacer
		si datos(i)>(n+m+c+j+a)/5 Entonces
			Escribir datos(i)
		FinSi
	FinPara
FinAlgoritmo
