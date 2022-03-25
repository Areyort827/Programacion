Algoritmo Ejercicio9_5
	Dimension vector1[3]
	Dimension vector2[3]
	para i=1 Hasta 3
		Escribir "Introduzca los valores del vector1"
		leer vector1(i)
	FinPara
	
	Para u=1 Hasta 3
		Escribir "Introduzca los valores del vector2"
		leer vector2(u)
	FinPara
	x1=vector1(1)
	x2=vector1(2)
	x3=vector1(3)
	y1=vector2(1)
	y2=vector2(2)
	y3=vector2(3)
Escribir "El producto escalar de estos vectores es " x1*y1+x2*y2+x3*y3
FinAlgoritmo
